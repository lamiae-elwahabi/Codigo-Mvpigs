package org.mvpigs.chapter6;

import static org.junit.Assert.*;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTest {

	static Scanner scan;
	//Propiedades
	int myIntA, myIntB, myIntC;
	int[] myArrayA = {0,1,2}; //Declaras el Array
	Object myObject;
	Object miObjeto;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// access resources for use in the tests
		scan = new Scanner(System.in);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// close resources after all tests complete
		scan.close();
	}

	@Before
	public void setUp() throws Exception {
		// assign some values to the variables
		// before beginning each test
		myIntA = 5;
		myIntB = 6;
		myIntC = 7;
	}

	@After
	public void tearDown() throws Exception {
		//nothing needs to be torn down
	}

	@Test
	public void testAssertEquals() {
		// (5 + 1) equals 6
		assertEquals((myIntA + 1), myIntB);
	}
	@Test
	public void testAssertArrayEquals() {
		int[] myNewArray = {0,1,2};
		// the elements in both arrays are 0, 1, and 2
		// order matters: {0,1,2} != {0,2,1}
		//Aqui egualamos el orden del array
		assertArrayEquals(myArrayA, myNewArray);
	}
	@Test
	public void testAssertTrue() {
		// 7 > 5 comprobar si esto es verdadero
		assertTrue(myIntC > myIntA);
	}
	@Test
	public void testAssertFalse() {
		// myArrayA.length == 3, 3 != 4 comprobar que esto es falso la longitud
		assertFalse(myArrayA.length == 4);
	}
	@Test 
	public void testAssertTruee() {
		//Comprobamos que 6	> 5
		assertTrue(myIntB > myIntA);
	}
	@Test
	public void testAssertNull() {
		// myObject has not been intialized
		//Comprobar que mi objeto no esta incializado
		assertNull(myObject);
	}
	@Test
	public void testAssertNotNull() {
		String newString = "Hello";
		// newString is intialized
		//Comprobamos que esta inicializado  el objeto newString
		assertNotNull(newString);
	}
	@Test
	public void testNoInicializado() {
		Integer newEntero = 4;
		//newEntero inicializado
		//Comprobar que esta inicializado
		assertNotNull(newEntero);
	}
	@Test
	public void testAssertSame() {
		myObject = new Object();
		Object pointerA = myObject;
		Object pointerB = myObject;
		// both pointerA and pointerB reference myObject
		//comprobar que las dos apuntan al mismo objeto
		assertSame(pointerA,pointerB);
	}
	@Test
	public void testAssertNotSame() {
		myObject = new Object();
		Object pointerA = new Object();
		Object pointerB = myObject;
		// pointerA is a new Object,
		// pointerB references myObject
		assertNotSame(pointerA,pointerB);

	}
	@Test
	public void testAssertNotSameLamiae() {

		miObjeto = new Object();
		Object pointerLamiae = new Object();
		Object pointerFatima = miObjeto;
		assertNotSame(pointerLamiae,pointerFatima);
	}
}


