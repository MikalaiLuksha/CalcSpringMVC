package tms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tms.entity.Operation;
import tms.service.CalcService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(path = "/history")
public class HistoryController {

    private CalcService calcService;

    public HistoryController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String history(Model model, HttpSession httpSession){
        List <Operation> history = (List) httpSession.getAttribute("history");
         model.addAttribute("history", history);
                return "history";
    }
}
