package br.com.marco.core;

import java.util.ArrayList;
import java.util.List;

import br.com.marco.model.Triangle;

/**
 * Main Class
 * 
 * @author Marco Souza
 *
 */
public class Principal {

	/**
	 * Method that gets the sum of the biggest numbers in each row of triangle
	 * 
	 * @param triangle
	 * @return
	 */
	public static int getSumOfHellTriangle(Triangle triangle) {
		List<Integer> biggestNumber = new ArrayList<Integer>();

		triangle.createTriangle(biggestNumber);
		triangle.showSumOfNumbers(biggestNumber);
		return triangle.getTotal();
	}

}
