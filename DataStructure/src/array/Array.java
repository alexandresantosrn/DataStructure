package array;

public class Array {

	public static void main(String[] args) {
		int[] myarray;
		int[] myarray2;
		String[] myarray3;
		int[][] myarray2d;

		myarray = initilizeArrayInt();
		myarray2 = initilizeArrayInt2();
		myarray3 = initializeArrayString();
		myarray2d = initializeArray2d();

		System.out.println("Elements of array(int)[0]: " + myarray[0]);
		System.out.println("Elements of array(int)[3]: " + myarray2[3]);
		System.out.println("Elements of array[String[1]: " + myarray3[1]);
		System.out.println("Elements of arrays[2D): " + myarray2d[2][2]);
	}

	private static int[] initilizeArrayInt() {
		int[] myarray; // Declaração
		myarray = new int[3]; // Inicializa o array de inteiros com 3 elementos

		myarray[0] = 1; // Atribui o elemento[0]
		myarray[1] = 2; // Atribui o elemento[1]
		myarray[2] = 3; // Atribui o elemento[2]

		return myarray;
	}

	private static int[] initilizeArrayInt2() {
		int[] myarray = { 1, 2, 3, 4, 5 };

		return myarray;
	}

	private static String[] initializeArrayString() {
		String[] myarray = { "Olá", "Mundo", "Java" };

		return myarray;
	}

	private static int[][] initializeArray2d() {
		// int[][] myarray2d = new int[3][4];
		int[][] myarray2d = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		return myarray2d;
	}

}
