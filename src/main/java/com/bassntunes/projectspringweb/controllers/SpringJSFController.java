/**
 * 
 */
package com.bassntunes.projectspringweb.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.bassntunes.projectspringweb.services.SpringService;

/**
 * @author Horiz
 * controlador de ejemplo para demostrar la integracion de spring con jsf
 */
@ManagedBean
@ViewScoped
public class SpringJSFController {

	// creando objeto sin spring
	// SpringService springService = new SpringServiceImpl();
	
	private String nombreEmpresa;
	private String nombreEmpleado;
	
	@ManagedProperty("#{springServiceImpl}")
	private SpringService springServiceImpl;
	
	@PostConstruct
	public void init() {
		String nombre = this.springServiceImpl.mostrarNombreEmpresa();
		System.out.println(nombre);
		this.setNombreEmpresa(nombre);
		
		String nombreEmpleado = this.springServiceImpl.mostrarNombreEMpleado();
		System.out.println(nombreEmpleado);
		this.nombreEmpleado = nombreEmpleado;
	}

	/**
	 * @return the springServiceImpl
	 */
	public SpringService getSpringServiceImpl() {
		return springServiceImpl;
	}

	/**
	 * @param springServiceImpl the springServiceImpl to set
	 */
	public void setSpringServiceImpl(SpringService springServiceImpl) {
		this.springServiceImpl = springServiceImpl;
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	/**
	 * @return the nombreEmpleado
	 */
	public String getNombreEMpleado() {
		return nombreEmpleado;
	}

	/**
	 * @param nombreEmpleado the nombreEmpleado to set
	 */
	public void setNombreEMpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	
}
