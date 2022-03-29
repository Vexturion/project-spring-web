/**
 * 
 */
package com.bassntunes.projectspringweb.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.bassntunes.projectspringweb.services.SpringService;

/**
 * @author Horiz
 * clase de prueba unitaria con spring y junit 4
 * no tiene soporte spring test para junit 5
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContest-test.xml"})
public class SpringJUnit4Test {

	@Autowired
	private SpringService springServiceImpl;
	
	@Test
	public void test() {
		assertNotNull(springServiceImpl);
		System.out.println(this.springServiceImpl.mostrarNombreEMpleado());
	}

}
