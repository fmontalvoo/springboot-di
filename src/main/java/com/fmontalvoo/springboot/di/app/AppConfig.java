package com.fmontalvoo.springboot.di.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;

import com.fmontalvoo.springboot.di.app.models.ItemFactura;
import com.fmontalvoo.springboot.di.app.models.Producto;
import com.fmontalvoo.springboot.di.app.services.IServicio;
import com.fmontalvoo.springboot.di.app.services.Servicio;
//import com.fmontalvoo.springboot.di.app.services.ServicioImportante;

@Configuration
public class AppConfig {

//	@Primary
	@Bean("default")
	public List<ItemFactura> registrarItems() {
		Producto p1 = new Producto("P1", 1.1);
		Producto p2 = new Producto("P2", 1.2);
		ItemFactura i1 = new ItemFactura(p1, 1);
		ItemFactura i2 = new ItemFactura(p2, 2);
		return Arrays.asList(i1, i2);
	}

	@Bean("itemsFactura")
	public List<ItemFactura> registrarItemsFactura() {
		List<ItemFactura> items = new ArrayList<>();
		Producto p1 = new Producto("P1", 1.1);
		Producto p2 = new Producto("P2", 1.2);
		Producto p3 = new Producto("P3", 1.3);
		Producto p4 = new Producto("P4", 1.4);
		Producto p5 = new Producto("P5", 1.5);
		items.add(new ItemFactura(p1, 1));
		items.add(new ItemFactura(p2, 2));
		items.add(new ItemFactura(p3, 3));
		items.add(new ItemFactura(p4, 4));
		items.add(new ItemFactura(p5, 5));
		return items;
	}

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
