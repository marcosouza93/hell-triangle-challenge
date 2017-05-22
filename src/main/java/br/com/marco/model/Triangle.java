package br.com.marco.model;

import java.util.List;

import br.com.marco.exception.TriangleException;

/**
 * Triangle Model
 * 
 * @author Marco Souza
 *
 */
public class Triangle {

	private int[][] triangle;
	private int totalRow = 0;
	private int position = 0;
	private int total = 0;
	private int latestPosition = 0;

	public Triangle(final int[][] p) throws TriangleException {
		if (p == null) {
			throw new TriangleException("Invalid Triangle!");
		}
		this.triangle = p;
	}

	private int getSize() {
		return triangle.length;
	}

	/**
	 * Create the tabulation for the triangle layout
	 * 
	 * @param count
	 */
	private void createTabulation(final int count) {
		for (int space = 0; space < (count / 2); space++) {
			System.out.printf(" ");
		}
	}

	/**
	 * Show the biggest numbers of each row and the sum of them
	 * 
	 * @param biggestNumber
	 */
	public void showSumOfNumbers(List<Integer> biggestNumber) {
		StringBuilder msg = new StringBuilder();

		for (Integer value : biggestNumber) {
			msg.append(" " + value + " +");
		}
		String finalMsg = msg.substring(1, msg.length() - 1);
		System.out.println("\n\n" + finalMsg + "= " + getTotal() + "\n");
	}

	/**
	 * Create the triangle layout
	 * 
	 * @param biggestNumber
	 */
	public void createTriangle(List<Integer> biggestNumber) {
		int count = getSize() * 2;

		System.out.println("Hell Triangle:");
		for (int row = 0; row < getSize(); row++) {
			System.out.printf("\n");

			createTabulation(count);
			createColumns(row);
			createTabulation(count);

			count -= 2;
			setTotal(getTotal() + getTotalRow());
			setTotalRow(0);
			biggestNumber.add(getTriangle()[row][getPosition()]);
		}
	}

	/**
	 * Print the values from triangle
	 * 
	 * @param row
	 */
	private void createColumns(int row) {
		for (int col = 0; col < getTotalColsByRow(row); col++) {
			if (col == 0)
				setLatestPosition(getPosition());
			System.out.printf("%d ", getTriangle()[row][col]);
			setPositionAndTotal(row, col);
		}
	}

	/**
	 * Set the current position and the biggest value of row
	 * 
	 * @param row
	 * @param col
	 */
	private void setPositionAndTotal(int row, int col) {
		if (getTriangle()[row][col] > getTotalRow()
				&& (getLatestPosition() == col || getLatestPosition() + 1 == col)) {
			setPosition(col);
			setTotalRow(getTriangle()[row][col]);
		}
	}

	public int getTotalColsByRow(int row) {
		return this.triangle[row].length;
	}

	public int getTotalRow() {
		return totalRow;
	}

	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getLatestPosition() {
		return latestPosition;
	}

	public void setLatestPosition(int latestPosition) {
		this.latestPosition = latestPosition;
	}

	public int[][] getTriangle() {
		return triangle;
	}

}
