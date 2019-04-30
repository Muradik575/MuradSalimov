package day_34_Custom_Methods_Retorn_Arrays_Varargs;
import java.util.Random;
public class Count_Arrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {2,3,4,5,6,7,5,5,7,4,3,2,5,6,3,4,4,5};
		// 1. with Print return right away
		System.out.println(findOccurences(nums,5));
		System.out.println(findOccurences(nums,6));
		// 2. assign return values to a variable
		int five = findOccurences(nums,5);
		System.out.println("5 values: "+ five);
		if(five > 0) {
			System.out.println("We hava 5s");
		}else {
			System.out.println("No 5s");
		}
		if(findOccurences(nums,2)>0) {
			System.out.println("We hava 2s");
		}else {
			System.out.println("No 2s");
		}
	// creat array and pass method
		int twenty =findOccurences(new int [] {10,20,20,40,30,}, 20);
		System.out.println("Twenty is "+twenty);
	
		
	 
	}// end of main method

	public static int findOccurences(int [] array, int value) {
		int count = 0;
		for(int num : array ) {
			if(num == value) {
				count++;
			}
		}
		return count;
		
		
		
		
	}
	
	public static int [] getArray () {
		int [] arr =  {3,5,44,66,3,78,3,2};
		return arr;
	}
	
	public static int [] getRamdomArray (int size) {
		
		Random rand = new Random(); // create Random class object 
		int [] arr = new int [size]; // declearing array with size number of array

		for(int i = 0; i<size;i++) {
			arr[i] = rand.nextInt(101); // get random numbers and assign to array index
		}
		return arr;	
	}
	
	
}// end of the class
