package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Fecha.Fecha;

public class pruebaFecha {
	Fecha f1;
	@Test
	public void test() {
		f1=new Fecha(2,2,2222);
		assertEquals(true,f1.valida());
		f1=new Fecha(29,2,2000);
		assertEquals(true,f1.valida());
		f1=new Fecha(30,2,2000);
		assertEquals(false,f1.valida());
	}


}
