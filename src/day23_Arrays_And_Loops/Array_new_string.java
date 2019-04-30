package day23_Arrays_And_Loops;

public class Array_new_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []names = new String [5];
		
		
		//				index	0		1		2		3		4
		String [] names2 = {"Murad", "Roman","Vlad","Burak","MARIA"};
		System.out.println(names2[4]);
		System.out.println("Number of items:"+ names2.length);
		String[]countries = {};
		
		//ARRAY HAS FIXED SIZE
		countries[0]="USA";
		String [] fruts = new String[] {"apples", "orange"};
		 // for each loop stands for collections of data
        // we need specify data type, variable name : our collection of data
        //for each loop
        // or enhanced loop
		for (String fruit : fruts) {
			System.out.println(fruit);
		}
		
		
		
		
		
	}

}
