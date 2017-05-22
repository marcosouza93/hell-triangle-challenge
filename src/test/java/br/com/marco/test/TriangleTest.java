package br.com.marco.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.marco.core.Principal;
import br.com.marco.exception.TriangleException;
import br.com.marco.model.Triangle;

/**
 * Test Class
 * 
 * @author Marco Souza
 *
 */
public class TriangleTest {

	@Test
	public final void test1() throws TriangleException {
		int[][] input = { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8, 4 } };
		Triangle triangle = new Triangle(input);
		assertEquals(26, Principal.getSumOfHellTriangle(triangle));
	}

	@Test
	public final void test2() throws TriangleException {
		int[][] input = { { 1 }, { 3, 1 }, { 7, 3, 7 }, { 2, 7, 5, 2 } };
		Triangle triangle = new Triangle(input);
		assertEquals(18, Principal.getSumOfHellTriangle(triangle));
	}

	/**
	 * Method for test an exception return case
	 */
	@Test(expected = TriangleException.class)
	public final void test3() throws TriangleException {
		int[][] input = null;
		Triangle triangle = new Triangle(input);
		Principal.getSumOfHellTriangle(triangle);
	}

	@Test
	public final void test4() throws TriangleException {
		int[][] input = { { 9 }, { 7, 1 }, { 8, 7, 5 } };
		Triangle triangle = new Triangle(input);
		assertEquals(24, Principal.getSumOfHellTriangle(triangle));
	}

	@Test
	public final void test5() throws TriangleException {
		int[][] input = { { 3 }, { 3, 6 }, { 4, 7, 9 }, { 9, 6, 4, 7 },
				{ 5, 8, 1, 9, 7 }, { 7, 8, 6, 2, 2, 4 },
				{ 4, 4, 1, 3, 2, 1, 8 } };
		Triangle triangle = new Triangle(input);
		assertEquals(39, Principal.getSumOfHellTriangle(triangle));
	}

	@Test
	public final void test6() throws TriangleException {
		int[][] input = { { 7 }, { 7, 4 }, { 1, 2, 3 }, { 8, 9, 1, 3 } };
		Triangle triangle = new Triangle(input);
		assertEquals(25, Principal.getSumOfHellTriangle(triangle));
	}

}
