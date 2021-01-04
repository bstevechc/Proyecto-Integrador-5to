package com.controllers.persona;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named("login")
@RequestScoped
public class LoginBean implements Serializable {
	private static final long serialVersionUID = 2L;

	private String correo;
	private String password;
	
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
