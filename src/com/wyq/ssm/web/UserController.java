package com.wyq.ssm.web;

import com.wyq.ssm.pojo.User;
import com.wyq.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private IUserService service;

    @RequestMapping("/addUser")
    public void addUser(User user){
        service.addUser(user);
    }

    @RequestMapping("/listAll")
    public String listAll(Model model){
        model.addAttribute("list", service.get());
        return "index";
    }
}
