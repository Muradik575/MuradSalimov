package day28_Arrays;
import java.io.IOException;
import java.nio.*; //nio is new input output
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;


public class FastFoodRestaurant {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// read all data and assign to array
		
		String [] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		System.out.println("Data size: " +data.length);
		
		
		//Print first array
		
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[data.length-1]);
		//System.out.println(Arrays.toString(data));
		// print each Restaurant information in separate lines
		
		int  counter = 0;
		
		for(String fuj:data) {
			System.out.println("#"+counter+"=>:"+fuj);
			counter++;
		}
	
		//Print all restaurant information in state of VA
		int count=0;
		for (String res:data) {
			if(res.contains(",VA,")){
				System.out.println(res);
				count++;
			}	
		}
		System.out.println("Tatal restaurant in VA :"+count);
		
		//find all restaurant information in state of VA
		// print the restaurant names along with cityname
		// subway - Herenden
		
		
		
		
		for(String res1:data) {
			if(res1.contains(",VA,")) {
				String [] arr= res1.split(",");
				System.out.println(arr[2]+" - "+arr[1]);
			}
		}
		
		
		
	}

}
