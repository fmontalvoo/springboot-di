package com.fmontalvoo.springboot.di.app.models;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//import org.springframework.web.context.annotation.RequestScope;
//import org.springframework.web.context.annotation.SessionScope;
//import org.springframework.web.context.annotation.ApplicationScope;

@Component
//@RequestScope // Crea una instancia de la clase por cada peticion http.
//@SessionScope // Crea una instancia de la clase y la mantiene mientras este abierto el navegador.
//@ApplicationScope
public class Factura {

	@Autowired
	private Cliente cliente;
	@Value("${factura.descripcion}")
	private String descripcion;
	@Autowired
	@Qualifier("default")
//	@Qualifier("itemsFactura")
	private List<ItemFactura> items;

	@PostConstruct
	private void init() {
		String apellido = this.cliente.getApellido();
		this.cliente.setApellido(apellido + " Ochoa");
	}
	
	@PreDestroy
	private void destroy() {
		System.out.println("Factura eliminada");
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

}
