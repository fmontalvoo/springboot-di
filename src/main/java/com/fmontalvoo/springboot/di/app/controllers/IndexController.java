package com.fmontalvoo.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fmontalvoo.springboot.di.app.services.IServicio;

@Controller
public class IndexController {

	// Inyeccion de dependencia a traves de la instancia.
	@Autowired
	@Qualifier("servicio") // Indica la implementacion a usar a traves del nombre.
	private IServicio servicio;

	/**
	 * Inyeccion de dependecias a traves del constructor.
	 */
//	@Autowired
//	public IndexController(IServicio servicio) {
//		this.servicio = servicio;
//	}

	/**
	 * Inyeccion de dependencias a traves del metodo setter.
	 * 
	 * @param model
	 * @return
	 */
//	@Autowired
//	public void setServicio(IServicio servicio) {
//		this.servicio = servicio;
//	}

	@GetMapping({ "", "/" })
	public String index(Model model) {
		model.addAttribute("servicio", servicio);
		return "index";
	}

}
