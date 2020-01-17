package com.projeto.asist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projeto.asist.dominio.Funcionario;
import com.projeto.asist.repositorio.FuncionarioRepository;

@Controller

public class FuncionarioController {
	
	
	
	@Autowired
	private FuncionarioRepository funcRepository;
	
	
	@GetMapping("/cadastrarFuncionario")
	public String home() {
		return "funcionario/cadastrarFuncionario";
	}
	
	@PostMapping("/cadastrarFuncionario")
	public String adicionar( Funcionario funcionario) {
		funcRepository.save(funcionario);
		return "redirect:/cadastrarFuncionario";
			
	}
	//@GetMapping("/cadastrarFuncionario")
	//public List<Funcionario> buscarTodos(){
	//List<Funcionario> lista = funcRepository.findAll();
	//	return lista; 
	//}
	

}
