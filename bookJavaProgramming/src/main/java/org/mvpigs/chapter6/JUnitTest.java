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
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
