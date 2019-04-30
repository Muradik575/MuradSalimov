package day27_Arrays;

import java.util.*;

public class Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare 2 int arrays that can hold hour and minute
				int[] time1 = new int[2];//0,0 by default
				int[] time2 = new int[2];//0,0 by default
				/*
				 * int[] time1 = {20, 45} ;
				   int[] time2 = {15, 33} ;
				 * 
				 */
				//System.out.println(time1[0]); //0
				time1[0] = 10; // hour
				time1[1] = 10; // minutes
				
				time2[0] = 10; // hour
				time2[1] = 10; // hours
				
				//Before comparing, check if both arrays have
				//valid hour/minute
				if(time1[0] < 0 || time1[0] > 23) { // hours
					System.out.println("Time1 has invalid hour");
					return; // stop  execution
				}
				
				if(time1[1] < 0 || time1[1] > 59) {// minutes
					System.out.println("Time1 has invalid minute");
					return;// stop  execution
				}
				
				if(time2[0] < 0 || time2[0] > 23) { // hours
					System.out.println("Time2 has invalid hour");
					return; // stop  execution
				}
				
				if(time2[1] < 0 || time2[1] > 59) { // minutes
					System.out.println("Time2 has invalid minute");
					return; // stop  execution
				}
				
				// COMPERE ARRAYS and tell which is earlier
				
		if(time1[0]<time2[0]) { 
			System.out.println("Time 1 is earlier");
		}else if(time1[0]<time2[0]) {
			System.out.println("Time 2 is earlier");

		}else {// hours are equal, check minuter
			if(time1[1]<time2[1]) {
				System.out.println("Time 1 is earlier");
			}else if(time2[1]<time1[1]) {
				System.out.println("Time 2 is earlier");
		}else {
			System.out.println("Same Time!");
		}
		
		
		
		
		
		
		
		
		
		
	}

	}
}
