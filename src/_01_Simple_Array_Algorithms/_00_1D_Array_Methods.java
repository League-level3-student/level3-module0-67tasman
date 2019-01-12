package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	//1. Complete the method so that it returns the sum of all
	//   of the integers in the array being passed in
	public static void main(String args[]) {
	int[] intArray = new int[3];

	intArray[0] = 1;
	intArray[1] = 2;
	intArray[2] = 3;
	System.out.println(sumIntArray(intArray));
	System.out.println(averageIntArray(intArray));
	System.out.println(containsIntValue(intArray, 3));
	System.out.println(getIndex(intArray,3));

	}
	public static int sumIntArray(int[] values) {
		
	int l = 0;	
for(int i = 0 ; i < values.length ; i ++) {
	int m = values[i];
	l = l + m;
}
return l;	
		
	}
	
	//2. Complete the method so that it returns the average of all
	//   of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
		int l = 0;	
		int a = 0;
		for(int i = 0 ; i < values.length ; i ++) {
			int m = values[i];
			l = l + m;
			a = l/values.length;
		}
		return a;	
	}
	
	
	//3. Complete the method so that it returns true if the integer
	//   array contains the value specified by the second parameter.
	//   It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
		boolean a = false;
		for(int i = 0 ; i < array.length ; i ++) {
			if(array[i]== value) {
				a = true;
			}
		}
		return a;	
	}
	
	//4. Complete the method so that it returns the index of the,
	//   first instance that the specified value occurs in the array.
	//   If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
		int index = 0;
		for(int i = 0 ; i < arr.length ; i ++) {
			if(arr[i]== value) {
			index = i;
			}
		}
		return index;	
	}
	
}
