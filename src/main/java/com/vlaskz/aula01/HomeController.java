package com.vlaskz.aula01;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homeApp(Model model){
        model.addAttribute("mensagem", "Esta foi uma mensagem injetada através do Model");
        return "index";
    }
}
