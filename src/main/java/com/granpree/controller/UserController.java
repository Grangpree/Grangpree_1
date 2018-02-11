package com.granpree.controller;


import com.granpree.dto.UserJoinDTO;
import com.granpree.dto.UserLoginInfoDTO;
import com.granpree.service.UserService;
import com.granpree.service.UserServiceImpl;
import com.granpree.utils.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test")
    public void test() {
        System.out.println("test");
    }

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public void join(@RequestParam @Valid UserJoinDTO userJoinDTO) {
        userService.join(userJoinDTO);
    }

    @RequestMapping(value = "/login")
    public void login(@RequestParam @Valid UserLoginInfoDTO userLoginInfoDTO) {
        userService.login(userLoginInfoDTO);
    }
}
