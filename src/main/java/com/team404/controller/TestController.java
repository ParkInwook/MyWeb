package com.team404.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.team404.command.UserVO;

@Controller
public class TestController {

	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	
	
	@ResponseBody
	@RequestMapping("/kkk/{a}/{b}/{c}")
	public String kkk(@PathVariable("a") String a, 
					  @PathVariable("b") String b,
					  @PathVariable("c") String c) {
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		return null;
		
	}
	
	@ResponseBody
	@RequestMapping("/kkk/{a}/{b}")
	public String kkk2(@PathVariable("a") String a, 
					  @PathVariable("b") String b
					 ) {
		
		
		System.out.println(a);
		System.out.println(b);

		return null;
		
	}
	
	
	@ResponseBody
	@RequestMapping("/aaa6")
	public String aaa(@RequestParam("a") String a) {
		
		System.out.println(a);
		
		return null;
	}
	
	
	@ResponseBody
	@RequestMapping("/xxxx")
	public String xxxx(@RequestBody HashMap<String, Object> map) {
		
		System.out.println(map.toString());
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
