package com.fran.Practica3_Spring.entities;

import java.util.List;

import javax.persistence.OneToMany;

import com.fran.ejercicio2.entities.Producto;

public class Clientes {

	private Long id;
	private String nombre;
	private String apellidos;
	private int fNacimiento;
	private String DNI;
	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getfNacimiento() {
		return fNacimiento;
	}
	public void setfNacimiento(int fNacimiento) {
		this.fNacimiento = fNacimiento;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
}


