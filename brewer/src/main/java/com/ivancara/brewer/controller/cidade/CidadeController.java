package com.ivancara.brewer.controller.cidade;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ivancara.brewer.model.Cidade;

@Controller
public class CidadeController {

	@RequestMapping("/cidades/novo")
	public String novo(Cidade cidade) {
		return "/cidade/CadastroCidade";
	}
	
	@RequestMapping(value = "/cidades/novo", method=RequestMethod.POST)
	public String novo(Cidade cidade, BindingResult result) {
		
		if(result.hasErrors()) {
			return novo(cidade);
		}
		
		return "redirect:/cidade/CadastroCidade";
	}
}
