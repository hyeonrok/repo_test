package com.example.demo.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {

	@Autowired
	CodeGroupService service;
//	CodeGroupService codeGroupService;
	@RequestMapping(value = "/codeGroupXdmList")
	public String codeGroupXdmList(Model model) throws Exception {
		
//		List<CodeGroupDto> codeGroupDtos = service.selectList();
//		model.addAttribute("list", codeGroupDtos);
//		// list = codeGroupDtos;
//		
//		for(CodeGroupDto a : codeGroupDtos) {
//			System.out.println(a.getName());
//		}
		
		model.addAttribute("list", service.selectList());
		
		return "codeGroupXdmList";
		
	}
	
	
	
	@RequestMapping(value = "/codeGroupView")
	public String codeGroupView(CodeGroupDto dto) throws Exception {
		
		System.out.println("dto.getseq() : " + dto.getSeq());
		System.out.println("dto.getName() : " + dto.getName());
		System.out.println("dto.geModDatetime() : " + dto.getModDatetime());
		return "codeGroupView";
	}
}
