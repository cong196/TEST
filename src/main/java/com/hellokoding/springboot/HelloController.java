package com.hellokoding.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import connect.adapter;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
    @RequestMapping("/icsse2017")
    public String icsse2017(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        return "mainicsse17";
    }
    @RequestMapping("/edit")
    public String edit(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
    	adapter get = new adapter();
    	String noidung = get.layNoidung();
        model.addAttribute("text",noidung);        
    	return "edit";
    }
    
    
   
    
}
