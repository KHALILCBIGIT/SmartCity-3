package com.gestion.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class PageController {

	 @RequestMapping(value="index")
	 public String First(){
	
 
		 return "index";
	 }
	 @RequestMapping(value="Login")
	 public String Login(){
	
 
		 return "Login";
	 }
	 
	 @RequestMapping(value="Auth")
	 public String Auth(@RequestParam("username")String username,@RequestParam("pass")String pass){
	
		 
		 System.err.println(username);
		 System.err.println(pass);
		 
		 return "index";
	 }
     

	 
}
