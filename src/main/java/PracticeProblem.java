public class PracticeProblem {

	public static boolean validIndex(int[] arr, int i) {
		try {
			return (arr[i] == arr[i]);
		}
		catch (IndexOutOfBoundsException e) {
			return false;
		}
	}

	public static int divide(int a, int b) {
		try {
			return a/b;
		}
		catch (ArithmeticException e) {
			return 0;
		}
	}

	public static int safeConvertStringtoInt(String s) {
		try {
			return Integer.parseInt(s);
		}
		catch (Exception e) { // too lazy to find what the specific exception is called here
			return 0;
		}
	}

}
