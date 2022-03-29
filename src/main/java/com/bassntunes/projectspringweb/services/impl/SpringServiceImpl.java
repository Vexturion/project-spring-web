/**
 * 
 */
package com.bassntunes.projectspringweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bassntunes.projectspringweb.dao.EmpleadoDAO;
import com.bassntunes.projectspringweb.services.SpringService;

/**
 * @author Horiz
 *
 */
@Service
public class SpringServiceImpl implements SpringService {

	@Autowired
	private EmpleadoDAO empleadoDAOImpl;
	
	@Override
	public String mostrarNombreEmpresa() {
		return "Anotaciones con Sping y JSF";
	}

	@Override
	public String mostrarNombreEMpleado() {
		return this.empleadoDAOImpl.consultarNombreEmpleado();
	}

}
