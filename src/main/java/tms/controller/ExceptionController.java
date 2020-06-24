package tms.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import tms.service.UserNotFoundException;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(UserNotFoundException.class)
public String ex (UserNotFoundException ex, Model model){
String message = ex.getMessage();
model.addAttribute("message", message);
return "userauth";
    }


    @ExceptionHandler(NullPointerException.class)
    public String ex(NullPointerException ex, Model model) {
        model.addAttribute("message", "Error");
        return "error";
    }
}