package com.ivancara.brewer.controller.estilo;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ivancara.brewer.model.Estilo;

@Controller
public class EstiloController {

	@RequestMapping("/estilos/novo")
	public String novo(Estilo estilo) {
		return "/estilo/CadastroEstilo";
	}
	
	@RequestMapping(value="/estilos/novo", method=RequestMethod.POST)
	public String novo(Estilo estilo, BindingResult result) {
		if(result.hasErrors()) {
			return novo(estilo);
		}
		
		return "redirect:/estilo/CadastroEstilo";
	}
}