package com.projeto.asist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {
	@RequestMapping("/")
	public String index() {
		return "login/formlogin";
	}

}
