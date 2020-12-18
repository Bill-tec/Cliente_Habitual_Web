package com.chweb.chweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.chweb.chweb.models.Cliente;
import com.chweb.chweb.models.Comercio;
import com.chweb.chweb.repository.ClienteRepository;
import com.chweb.chweb.repository.ComercioRepository;

@Controller
public class CadastroController {
	@Autowired
	private ClienteRepository clienteR;
	@RequestMapping(value = "/cadastrarCliente", method=RequestMethod.GET)
	public String formCliente() {
		return "cadastro/cadastroCliente";
	}
	
	@RequestMapping(value = "/cadastrarCliente",method=RequestMethod.POST)
	public String formSaveCliente(Cliente cliente) {
		clienteR.save(cliente);
		return "redirect:/";
	}
	
	/* Comercio */
	@Autowired
	private ComercioRepository comercioR;
	
	@RequestMapping(value = "/cadastrarComercio", method=RequestMethod.GET)
	public String formComercio() {
		return "cadastro/cadastroComercio";
	}
	@RequestMapping(value = "/cadastrarComercio", method=RequestMethod.POST)
	public String formSaveComercio(Comercio comercio) {
		comercioR.save(comercio);
		return "redirect:/";
	}
	
	@RequestMapping("/comercios")
	public ModelAndView listaComercios() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Comercio> comercios = comercioR.findAll();
		mv.addObject("comercio", comercios);
		return mv;
	}

}
