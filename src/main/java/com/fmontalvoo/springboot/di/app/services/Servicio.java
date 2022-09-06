package com.fmontalvoo.springboot.di.app.services;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service("servicio")
public class Servicio implements IServicio{

	@Override
	public String proceso() {
		return "Proceso...";
	}

}
