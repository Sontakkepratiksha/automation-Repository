

public class murch {
	public static void main(String[] args) {
		
		int arr1[] = { 10, 20, 30, 40 };
		int arr2[] = { 50, 60, 70, 80 };
		int index = 0;
		int arr3[] = new int [arr1.length | arr2.length];
		for (int i = 0; i<= arr1.length - 1; i++) {
			arr3[index] = arrl[i];
			index++;
		}
		for (int i = 0; i <= arr2.length -1; i++) {
			arr3[index] = arr2[i];
			index++;
		}
		for (int i = 0; i<= arr3.length - 1; i++) {
			System.out.println(arr3[i] + " ");
		}
	}

}
