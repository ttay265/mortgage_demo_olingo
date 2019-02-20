package com.morgage.controller;

import com.morgage.model.User;
import com.morgage.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/api/findall")
    @ResponseBody
    public List<User> findall() {
        List<User> list = userRepository.findAll();
        return list;
    }


}
