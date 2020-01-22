package com.softtek.java.sboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebControllerApp {
	
	@Value("${jacademy.app.title}")
	private String appTitle;
	
	
	@GetMapping("/")
	public String goHome(Model model) {
		model.addAttribute("jaTitle", appTitle);
		
		return "index";
	}	
	
	@GetMapping("/about.html")
	public String goAbout() {
		return "about";
	}	
	
	@GetMapping("/index.html")
	public String goRedirectHome(Model model) {
		
		List<String> mark1 = Arrays.asList(
				"Mark-1");
		List<String> mark2 = Arrays.asList(
				"Mark-2");
		List<String> mark3 = Arrays.asList(
				"Mark-3");
		List<String> mark4 = Arrays.asList(
				"Mark-4");
		
		model.addAttribute("jaTitle", appTitle);
		model.addAttribute("mark1", mark1);
		model.addAttribute("mark2", mark2);
		model.addAttribute("mark3", mark3);
		model.addAttribute("mark4", mark4);
		return "index";
	}	
	
	@GetMapping("/services.html")
	public String goServices() {
		return "services";
	}	
	
	@GetMapping("/products.html")
	public String goProducts() {
		return "products";
	}
	
	@GetMapping("/blog-home.html")
	public String goBlogHome() {
		return "blog-home";
	}
	
	@GetMapping("/blog-single.html")
	public String goBlogSingle() {
		return "blog-single";
	}
	
	@GetMapping("/contact.html")
	public String goContact() {
		return "contact";
	}
	
	@GetMapping("/elements.html")
	public String goElements() {
		return "elements";
	}
	
	@GetMapping("/product-details.html")
	public String goProductDetails() {
		return "product-details";
	}
	
}
