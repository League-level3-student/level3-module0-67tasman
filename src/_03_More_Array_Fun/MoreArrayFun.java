package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
	String[] a = new String[4];
	a[0] = "a";
	a[1] = "b";
	a[2] = "c";
	a[3] = "d";
	//printStrings(a);
	//reversePrint(a);
	//everyOther(a);
	random(a);
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printStrings(String[] strings) {
		for(int i = 0 ; i < strings.length ; i ++) {
		System.out.println(strings[i]);	
		}
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void reversePrint(String[] strings) {
		for(int i = strings.length-1 ; i > -1 ; i=i-1) {
		System.out.println(strings[i]);	
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void everyOther(String[] strings) {
		for(int i = 0 ; i < strings.length ; i=i+2) {
		System.out.println(strings[i]);	
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void random(String[] strings) {
			int random = (int) (Math.random() * 4);
			System.out.println(strings[random]);
			int random2 = (int) (Math.random() * 4);
			while(random2==random) {
				random2 = (int) (Math.random() * 4);
			}
			System.out.println(strings[random2]);
			int random3 = (int) (Math.random() * 4);
			while(random3 == random || random3 ==random2) {
				random3 = (int) (Math.random() * 4);
			}
			System.out.println(strings[random3]);
			int random4 = (int) (Math.random() * 4);
			while(random4==random || random4 == random2 || random4 == random3) {
				random4 = (int) (Math.random() * 4);
			}
			System.out.println(strings[random4]);
	}
	
}
