package com.csb.appadvc2122.controller;

import com.csb.appadvc2122.dto.UserDTO;
import com.csb.appadvc2122.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping
    private String list(Model model) {
        model.addAttribute("users", userService.list());
        return "user/index";
    }

    @GetMapping("/add")
    private String getUserAddForm(Model model) {
        model.addAttribute("user", new UserDTO());
        return "user/add-user";
    }

    @PostMapping
    private String add(UserDTO user, Model model) {
        userService.add(user);
        return list(model);
    }


    @PutMapping
    private String updateUser(UserDTO user, Model model) {
        userService.update(user);
        return list(model);
    }

    @DeleteMapping
    private String deleteUser(UserDTO user, Model model) {
        userService.delete(user.getId());
        return list(model);
    }

}