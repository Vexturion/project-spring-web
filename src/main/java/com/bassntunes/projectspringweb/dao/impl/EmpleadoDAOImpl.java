/**
 * 
 */
package com.bassntunes.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.bassntunes.projectspringweb.dao.EmpleadoDAO;

/**
 * @author Horiz
 *
 */

@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		return "Alejandro Cruz";
	}

}
