package tms.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/logout")
public class LogoutController {

    @GetMapping
    public String logout (HttpSession httpSession){
        httpSession.removeAttribute("currentUser");
        httpSession.setAttribute("check", false);
        return "index";
    }
}
