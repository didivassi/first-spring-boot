package academy.mindswap.firstspringboot.controllers;

import academy.mindswap.firstspringboot.model.User;
import academy.mindswap.firstspringboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class UserController {

    private UserService userService;

    @GetMapping("/users")
    public String getUsers(Model model){

        model.addAttribute("users", userService.getUsers());
        return "users";
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable int id, Model model) {
        Optional<User> user = userService.getUserByID(id);

        if(user.isEmpty()){
            return "404";
        }

        model.addAttribute("user", user.get());

        return "user";
    }

    @PostMapping(path="/user", consumes = "application/json")
    public String createUser(@RequestBody User user, Model model){

        if(userService.addUser(user)){
         return getUsers(model);
        }

        return "404";
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
