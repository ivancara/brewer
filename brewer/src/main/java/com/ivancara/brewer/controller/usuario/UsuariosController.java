package com.ivancara.brewer.controller.usuario;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ivancara.brewer.model.Usuario;

@Controller
public class UsuariosController {
	
	@RequestMapping("/usuarios/novo")
	public String novo(Usuario user) {
		return "/usuario/CadastroUsuario";
	}
	
	@RequestMapping(value = "/usuarios/novo", method=RequestMethod.POST)
	public String novo(@Valid Usuario user, BindingResult result) {
		
		if(result.hasErrors()) {
			return novo(user);
		}
		
		return "redirect:/usuario/CadastroUsuario";
	}
	
}
