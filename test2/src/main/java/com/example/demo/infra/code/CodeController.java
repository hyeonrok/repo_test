package com.example.demo.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {

	@Autowired
	CodeService service;
	
	@RequestMapping(value = "codeXdmList")				//매퍼 가져오기, Xdm은 ifcm같은건지?
	public String codeXdmList(Model model) throws Exception{		//model 애매
	
		model.addAttribute("list", service.selectList());
	System.out.println(model.toString());
		
		return "codeXdmList";
	}
	
}
