package com.granpree.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by psmkab on 2018. 1. 2..
 */

@RestController
@Slf4j
public class HelloController {
    @GetMapping(value = "hello")
    public void Hello() {
        log.info("this is the first page --");
    }
}
