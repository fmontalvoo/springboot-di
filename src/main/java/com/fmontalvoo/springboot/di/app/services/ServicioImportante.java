package com.fmontalvoo.springboot.di.app.services;

//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Primary // Da preferencia a esta clase cuando se inyecta a traves de la interfaz.
//@Component("servicioImportante")
@Service("servicioImportante")
public class ServicioImportante implements IServicio{

	@Override
	public String proceso() {
		return "Proceso importante...";
	}

}
