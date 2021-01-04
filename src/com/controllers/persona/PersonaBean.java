package com.controllers.persona;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;



import java.util.Arrays;

@Named("persona")
@RequestScoped
public class PersonaBean implements Serializable {
	private static final long serialVersionUID = 2L;
	private String nombre;
	private String edad;
	private String direccion;
	private String correo;
	private String estado_civil;
	private String []pasatiempos;
	private String ciudad;
	private String clave;

	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	private String apellido;
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	public String[] getPasatiempos() {
		return pasatiempos;
	}
	public void setPasatiempos(String[] pasatiempos) {
		this.pasatiempos = pasatiempos;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPasatiemposString() {
		return "" + Arrays.toString(pasatiempos);		
	}
	

	
	
	
	
}
