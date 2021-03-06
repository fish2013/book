package com.midread.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(value="")
	public String index(Model model){
		return "index";
	}
	
	@RequestMapping(value="/wisdoms/txt")
	public String txt(Model model){
		return "upload/txt";
	}
	@RequestMapping(value="/wisdoms/essay")
	public String essay(Model model){
		return "upload/essay";
	}
	
}
