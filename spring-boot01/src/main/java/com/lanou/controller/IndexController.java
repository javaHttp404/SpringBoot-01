package com.lanou.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanou.mapper.AuthUserMapper;
import com.lanou.service.AuthService;

@Controller
public class IndexController {

	private Logger log = Logger.getLogger(IndexController.class);

	@Resource
	private AuthUserMapper authUserMapper;

	@RequestMapping("/index")
	public String index() {
		// ghjkghjkhj
		log.info("进入index");
		return "index";
	}

	@ResponseBody
	@RequestMapping("/userAll")
	public Object users() {
		return authUserMapper.selectAll();
	}

}
