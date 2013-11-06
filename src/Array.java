
public class Array {

	public static void main(String[] args) {
		
		// int array[] = {2,4,5,7,9};
		int array[] = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
}
