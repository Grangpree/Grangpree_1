package com.granpree.controller;

import com.granpree.utils.ResponseWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by psmkab on 2018. 1. 2..
 */

@RestController
@Slf4j
public class HelloController {

	@GetMapping("path")
	public ResponseWrapper get() {
		return null;
	}
}
