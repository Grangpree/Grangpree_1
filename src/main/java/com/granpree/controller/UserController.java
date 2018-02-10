package com.granpree.controller;


import com.granpree.dto.UserJoinDTO;
import com.granpree.dto.UserLoginInfoDTO;
import com.granpree.service.UserService;
import com.granpree.utils.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/user/join")
    public ResponseWrapper join(@RequestParam @Valid UserJoinDTO userJoinDTO) {
        return userService.join(userJoinDTO);
    }

    @GetMapping(value = "/user/login")
    public ResponseWrapper login(@RequestParam @Valid UserLoginInfoDTO userLoginInfoDTO) {
        return userService.login(userLoginInfoDTO);
    }
}
