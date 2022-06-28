package com.csb.appadvc2122.controller;


import com.csb.appadvc2122.dto.AdminDTO;
import com.csb.appadvc2122.dto.UserDTO;
import com.csb.appadvc2122.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    private String list(Model model) {
        model.addAttribute("users", adminService.list());
        return "admin/index";
    }

    @GetMapping("/add")
    private String getAdminAddForm(Model model) {
        model.addAttribute("user", new AdminDTO());
        return "user/add-user";
    }

    @PostMapping
    private String add(AdminDTO user, Model model) {
        adminService.add(user);
        return list(model);
    }

    @PutMapping
    private String updateUser(AdminDTO user, Model model) {
        adminService.update(user);
        return list(model);
    }

    @DeleteMapping
    private String deleteUser(AdminDTO user, Model model) {
        adminService.delete(user.getId());
        return list(model);
    }

}