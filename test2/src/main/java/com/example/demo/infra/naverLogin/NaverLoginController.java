package com.example.demo.infra.naverLogin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NaverLoginController {
	
	@Value("${clientId}")
	private String clientId;

	@Value("${callbackUrl}")
	private String callbackUrl;
	
	@RequestMapping(value ="/naverLogin")
	public String naverLogin(Model model) throws Exception{
		
		model.addAttribute("clientId", clientId);
		model.addAttribute("callbackUrl", callbackUrl);
		return "naverLogin/naverLogin";
	}
	
	@RequestMapping(value ="/naverLoginCallback")
	public String naverLoginCallback(Model model,NaverLoginDto dto) {
		
		model.addAttribute("info", dto);
		return "naverLogin/naverLoginCallback";
	}
}
