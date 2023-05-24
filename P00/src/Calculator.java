/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 22026846, 24 May 2023 11:34:52 am
 */

/**
 * @author 22026846
 *
 */
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}
	public int multiple(int a, int b) {
		return a * b;
	}
	public int divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException();
		}
		return a / b;
	}
}
