package day26_Arrays;

import java.util.Arrays;
import java.util.Random;

public class Names_Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly",
				"Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose", "Louis",
				"Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane", "Logan",
				"Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };

		// print number of names the array
		System.out.println("Total names: " + names.length);
		// print all the names in single line
		System.out.println(Arrays.deepToString(names));
		// print in column format two name in each line
		for (int i = 0; i < names.length; i += 2) {
			System.out.println(names[i] + ", " + names[i + 1]);
			// print male names in one column
		}
		System.out.println("##### MALE NAMES ########");

		for (int i = 0; i < names.length; i += 2) {
			System.out.print(names[i] + ",");
		}

		System.out.println("##### FEMALE NAMES ########");

		for (int f = 0; f < names.length; f++) {
			if (f % 2 == 1) {
				if (f == names.length - 1) {
					System.out.println(names[f]);
				} else {
					System.out.print(names[f] + ",");
				}

			}
		}

//		for (int i = 0; i < names.length; i+=2) {
//			System.out.print(names[i+1]+",");
//		}

		// print random name from this array
		// use random class
		System.out.println("\n");
Random random = new Random(); // calling a Random Class

int r = random.nextInt(names.length);

		System.out.println("Random name : "+names[r]);

		// PRINT all names that are up  4 charakters in upper case in same line
		
//		for (int i = 0; i < names.length; i++) {
//			if(names[i].length()<=4) {
//				System.out.print(names[i]);
//			}
//		}
		
		
		// PRINT all names that are up  4 charakters in upper case in same line
		
		
		for(String name: names) { // reasigning names[] to the String name
			if(name.length()<=4) { // checking if any value in the String name <= 4 characters
				System.out.print(name.toUpperCase()+","); // printing the values with 4 or less characters in upper case
			}
		}
		System.out.println("\n NEMES LENGTH SORT");
		String namesUptTo4 = "";
		String names5to6 = "";
		String names7orMore = "";
		
		
		for (String name:names) {
			if(name.length()<=4) {
				namesUptTo4+=name +",";
			}else if(name.length()==5 || name.length()==6 ) {
				names5to6 += name + ",";
			}else {
				names7orMore+=name + ",";
			}
			
		}
		
		System.out.println("namesUptTo4: "+namesUptTo4.substring(0,namesUptTo4.length()-2));
		System.out.println("names5to6: "+names5to6.substring(0,names5to6.length()-2));
		System.out.println("names7orMore: "+names7orMore.substring(0,names7orMore.length()-2));
		System.out.println();
		
		System.out.println("Switching the names from MALE to FEMALE printing first");
		
		System.out.println(Arrays.toString(names));
		//CODE HERE James, Mary,
		for(int i = 0; i < names.length; i+=2) {
			String temp = names[i];
			names[i] = names[i+1];
			names[i+1] = temp;	
		}
		System.out.println(Arrays.toString(names));
		
//		String str1 = "first word";
//		String str2 = "second word";
//		
//		String temp = str1;           // SAME THING AS IN LINES FROM 114 TO 121
//		str1 = str2;
//		str2 = temp;
//		
//		System.out.println("str1 - " + str1);
//		System.out.println("str2 - " + str2);
//		
		
		
		
		for (int i = 0 ; i<names.length-1;i+=2) { // Samir's code
            names[i]+=names[i+1];
            names[i+1]=names[i].substring(0,(names[i].length()-1)-(names[i+1].length()-1));
            names[i]=names[i].substring((names[i+1].length()));
			
		}
		System.out.println("*****");
		
		System.out.println(Arrays.deepToString(names));	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
