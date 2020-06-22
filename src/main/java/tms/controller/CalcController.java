package tms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tms.service.CalcService;

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
    public String calc(double num1, double num2, String operation, Model model){
        if (num1 != 0|| num2 != 0|| operation != null){
        double sum = calcService.calculation(operation, num1, num2);
        model.addAttribute("result", sum);
        }
        return "calc";
    }
}
