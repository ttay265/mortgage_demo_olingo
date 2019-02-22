package com.morgage.controller;

import com.morgage.model.User;
import com.morgage.org.apache.olingo.odata2.sample.service.MyServiceFactory;
import com.morgage.repository.UserRepository;
import com.morgage.service.UserService;
import org.apache.olingo.odata2.api.ODataServiceFactory;
import org.apache.olingo.odata2.api.processor.ODataSingleProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/api/findall")
    @ResponseBody
    public List<User> findall() {
        List<User> list = userService.findAll();
        return list;

    }

    @RequestMapping("/accounts")
    @ResponseBody
    public List<User> accounts() {
    return null;
    }

    @RequestMapping(value = "/tao-nguoi-dung", method = RequestMethod.POST)
    public Boolean createUser() {
        return false;
    }

    @RequestMapping(value = "api/chinh-sua-nguoi-dung")
    public Boolean editUser() {
        return false;
    }

}

