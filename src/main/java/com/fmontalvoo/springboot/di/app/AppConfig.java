package com.fmontalvoo.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;

import com.fmontalvoo.springboot.di.app.services.IServicio;
import com.fmontalvoo.springboot.di.app.services.Servicio;
//import com.fmontalvoo.springboot.di.app.services.ServicioImportante;

@Configuration
public class AppConfig {

	@Bean("servicio")
	public IServicio registrarServicio() {
		return new Servicio();
	}

//	@Bean("servicioImportante")
//	@Primary
//	public IServicio registrarServicioImportante() {
//		return new ServicioImportante();
//	}

}
