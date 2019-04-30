package day28_Arrays;

import java.util.Arrays;

public class SockerTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Decleared MultiD array with 2 rows and 6 colums

		String [][] teams = new String [2][6];
		
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";
		
		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshot";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roma";
		teams[1][5] = "Dmitriy";
		
		System.out.println("First players of  first team: " ); 
		
		System.out.println(teams [0][0]);
		System.out.println(teams [0][1]);
		System.out.println(teams [0][2]);
		System.out.println(teams [0][3]);
		System.out.println(teams [0][4]);
		System.out.println(teams [0][5]);
		
		
		System.out.println("Number of rows: "+ teams.length);
		System.out.println("People in first team :"+teams[0].length);
		System.out.println("People in second team :"+teams[1].length);

		System.out.println(Arrays.deepToString(teams)); // prints multiD array at ones
		
		
		//				[0]array , with [4] index						
		int [] [] city = {{100,500,1234,5673},{1234,6543,76545,75432},{9849,34334,34,43434}};
		
		
		System.out.println(Arrays.deepToString(city));
		System.out.println(Arrays.toString(city[0]));
		
		int [][] scores= {{3,5,10},{6,4,2,5}};
		
		System.out.println("Days played/Number of arrays:"+scores.length);
		
		System.out.println("Numbe played/Number of arrays:"+ scores[0].length);
		System.out.println("Numbe played/Number of arrays:"+scores [1].length);
		
		
		
		int [][]values = new int [4][];
		values [0] = new int[] {2,3,4,6,9,10,};
		values[1] = new int[]{34,45,6,5,34,2,2,43,45,56,567,3};
		values [2] = new int[2];
		values[2][0]= 55;
		values[2][1]= 88;
		
		values[3]= new int[] {5,6,8,9,2,7};
		
		
		System.out.println(Arrays.deepToString(values));
		
		
		

	}

}
