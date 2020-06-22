package tms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tms.service.CalcService;

import java.util.List;

@Controller
@RequestMapping(path = "/history")
public class HistoryController {

    private CalcService calcService;

    public HistoryController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String history(Model model){
        List history = calcService.getHistory();
        model.addAttribute("history", history);
                return "history";
    }
}
