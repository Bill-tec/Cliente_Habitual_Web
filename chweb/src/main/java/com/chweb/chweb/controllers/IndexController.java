package com.chweb.chweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chweb.chweb.models.Comercio;
import com.chweb.chweb.repository.ComercioRepository;

@Controller
public class IndexController {
	@Autowired
	private ComercioRepository comercioR;
	@RequestMapping("/")
	public ModelAndView listaComercios() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Comercio> comercios = comercioR.findAll();
		mv.addObject("comercio", comercios);
		return mv;
	}
}
