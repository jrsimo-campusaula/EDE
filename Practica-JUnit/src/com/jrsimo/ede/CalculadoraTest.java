package com.jrsimo.ede;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora c; 
	
	@Before
	public void antesDeTest(){
		c = new Calculadora();
		System.out.println("antes del Test");
	}
	
	@BeforeClass
	public static void antesQueTodoTest(){
		System.out.println("antes de todo\n");
	}
	
	@Test
	public void sumarTest(){
		double valorEsperado = 4;
		double valorReal = c.sumar(2,2); // 2+2 = 4
		
		assertEquals(valorEsperado,valorReal,0.001);
		System.out.println("sumarTest");
		assertFalse(false);
		
	}
	
	@Test
	public void restarTest(){
		double valorEsperado = 4;
		double valorReal = c.restar(6,2); // 2+2 = 4
		
		assertEquals(valorEsperado,valorReal,0.001);
		System.out.println("resarTest");

		
	}
	

	@Test
	public void multiplicarTest(){
		double valorEsperado = 4;
		double valorReal = c.multiplicar(2,2); // 2+2 = 4
		
		assertEquals(valorEsperado,valorReal,0.001);
		System.out.println("multiplicarTest");

		
	}
	
	@Test
	public void dividirTest(){
		double valorEsperado = 4;
		double valorReal = c.dividir(8,2); // 2+2 = 4
		
		assertEquals(valorEsperado,valorReal,0.001);
		System.out.println("dividirTest");

		
	}
	
	@After
	public void despuesDeTest(){
		c=null;
		System.out.println("después del test");
	}
	
	@AfterClass
	public static void setUpAfterClass(){
		//c=null;
		System.out.println("\ndespués de todo");
		
	}
	


}
