package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Main.Calculadora;
class CalculadoraTest {
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Hola SUBC");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Hola TDAC");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Hola SU");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Hola TD");
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void testSuma() {
		assertEquals(5,Calculadora.suma(3,2));
	}
	@Test
	void testResta() {
		assertEquals(1,Calculadora.resta(3,2));
	}
	@Test
	void testMultiplicacion() {
		assertEquals(6,Calculadora.multiplica(3,2));
	}
	@Test
	void testDivision() {
		assertEquals(2,Calculadora.divide(4,2));
	}

}
