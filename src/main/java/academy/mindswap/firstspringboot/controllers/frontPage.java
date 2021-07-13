package academy.mindswap.firstspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class frontPage {

    @GetMapping("/")
    public String frontPage(Model model){
        return "index";
    }
}
