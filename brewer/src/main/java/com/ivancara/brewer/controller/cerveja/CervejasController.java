package com.ivancara.brewer.controller.cerveja;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ivancara.brewer.model.Cerveja;
import com.ivancara.brewer.repository.Cervejas;

@Controller
public class CervejasController {

	@Autowired
	private Cervejas cervejas;

	private static final Logger logger = LoggerFactory
			.getLogger(CervejasController.class);

	@RequestMapping("/cervejas/novo")
	public String novo(Cerveja cerveja) {
		cervejas.findAll();
		System.out.println("foi-se");
		return "/cerveja/CadastroCerveja";
	}

	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	private String cadastrar(@Valid Cerveja cerveja, BindingResult result,
			Model model, RedirectAttributes attrib) {
		if (result.hasErrors()) {
			return novo(cerveja);
		}

		attrib.addFlashAttribute("mensagem", "show de bola mein");
		return "redirect:/cervejas/novo";
	}
}
