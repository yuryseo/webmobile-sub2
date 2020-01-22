package com.pet.sns.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@Api("Post Rest API")
public class PostRestController {
	
}
