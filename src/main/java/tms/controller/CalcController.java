package tms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tms.entity.Operation;
import tms.service.CalcService;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/calc")
public class CalcController {



    private CalcService calcService;



    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String calc(){
        return "calc";
    }


    @PostMapping
    public String calc(double num1, double num2, String operation, Model model, HttpSession httpSession){
        if (num1 != 0|| num2 != 0|| operation != null){
        double res = calcService.calculation(operation, num1, num2);
            String symbol = calcService.symbol(operation);
            model.addAttribute("result", res);
            List <Operation> history = (List) httpSession.getAttribute("history");
            if (history == null){
                history =  new ArrayList<>();
            }
            history.add(new Operation(num1, num2, res, symbol));
            httpSession.setAttribute("history", history);
        }
        return "calc";
    }
}
