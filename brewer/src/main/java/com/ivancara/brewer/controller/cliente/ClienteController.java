package com.ivancara.brewer.controller.cliente;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ivancara.brewer.model.Cliente;

@Controller
public class ClienteController {

	@RequestMapping("/clientes/novo")
	public String novo(Cliente cliente) {
		return "/cliente/CadastroCliente";
	}

	@RequestMapping(value = "/clientes/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cliente cliente, BindingResult result) {

		if (result.hasErrors()) {
			return novo(cliente);
		}
		
		
		return "redirect:/clientes/novo";
	}

}
