package com.basicspringboot.web;

import com.basicspringboot.domain.User;
import com.basicspringboot.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * Copyright (c) GL Finance Plc. All rights reserved. (http://www.gl-f.com/)
 * Author: Ron Rith (r.ron@gl-f.com) on 2017-07-28.
 */
@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView index() {
        List<User> userList = (List<User>) userRepository.findAll();
        return new ModelAndView("index", "users", userList);
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public ModelAndView show(Model model) {
        return new ModelAndView("save", "command", new User());
    }

    @RequestMapping(value = "users/save", method = RequestMethod.POST)
    public ModelAndView store(@Valid User user) {
        userRepository.save(user);
        return new ModelAndView("redirect:/users");
    }

    @RequestMapping(value = "users/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("user", userRepository.findOne(id));
        return "/edit";
    }

    @RequestMapping(value = "users/edit", method = RequestMethod.POST)
    public String update(User user) {
        userRepository.save(user);
        return "redirect:/users";
    }

    @RequestMapping(value = "users/delete/{id}")
    public String delete(@PathVariable Long id) {
        userRepository.delete(id);
        return "redirect:/users";
    }

}
