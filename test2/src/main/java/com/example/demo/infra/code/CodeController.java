package com.example.demo.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.infra.codegroup.CodeGroupDto;

@Controller
public class CodeController {

	@Autowired
	CodeService service;
	
	@RequestMapping(value = "/CodeXdmList")				//매퍼 가져오기, Xdm은 ifcm같은건지?
	public String codeXdmList(Model model) throws Exception{		//model 애매
	
		model.addAttribute("list", service.selectList());
	System.out.println(model.toString());
		
		return "CodeXdmList";
	}
	
	@RequestMapping(value = "/CodeView")
	public String CodeView(CodeDto dto, Model model) throws Exception{
		
		model.addAttribute("item", service.selectOne(dto));
		return "CodeView";
	}
	
	@RequestMapping(value = "/CodeForm")
	public String CodeForm(CodeDto dto, Model model) throws Exception{
		
		model.addAttribute("item", service.selectOne(dto));
		return "CodeForm";
	}
	
	@RequestMapping(value = "/CodeReg")
	public String CodeReg(CodeDto dto, Model model) throws Exception {
		
		//System.out.println("dto.getSeq() : " + dto.getSeq());

		return "CodeReg";
	}
	
	@RequestMapping(value = "/CodeInsert")
	public String CodeInsert(CodeDto dto) throws Exception {
		
		//System.out.println("dto.getName() : " + dto.getName());
		
		service.insert(dto);
		return "redirect:/CodeXdmList";
	}

	@RequestMapping(value = "/CodeUpdate")
	public String CodeUpdate(CodeDto dto) throws Exception {
		
		//System.out.println("dto.getName() : " + dto.getName());
		System.out.println(dto.toString());
		service.update(dto);
		return "redirect:CodeXdmList";
	}
	
	@RequestMapping(value = "/CodeUelete")
	public String CodeUelete(CodeDto dto) throws Exception {
		
		//System.out.println("dto.getName() : " + dto.getName());
		System.out.println(dto.toString()+"---------------------------");
	
		service.uelete(dto);
		return "redirect:/CodeXdmList";
	}
	
	@RequestMapping(value = "/CodeDelete")
	public String CodeDelete(CodeDto dto) throws Exception {
		
		//System.out.println("dto.getName() : " + dto.getName());
		System.out.println(dto.toString());
		service.delete(dto);
		return "redirect:/CodeXdmList";
	}
	
}
