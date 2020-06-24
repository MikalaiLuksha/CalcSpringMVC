package tms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tms.entity.User;
import tms.service.UserService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/reg")
    public String reg(){
        return "userreg";
    }

    @PostMapping(path = "/reg")
       public String reg (User user, Model model){
        userService.addUser(user);
        model.addAttribute("message", "Registration successfully");
        return "index";
    }


    @GetMapping(path = "/auth")
    public String auth (){
        return "userauth";
    }

    @PostMapping (path = "/auth")
    public String auth (User user, Model model, HttpSession httpSession){
        User currentUser = userService.checkAuth(user);
        httpSession.setAttribute("currentUser", currentUser);
        httpSession.setAttribute("check", true);
        model.addAttribute("message", "Authorisation successfully");
        return "index";
    }


}

