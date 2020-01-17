package com.projeto.asist.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.asist.dominio.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
	Usuario findByLogin(String login);
	
	

}
