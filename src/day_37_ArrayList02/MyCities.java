package day_37_ArrayList02;

import java.util.ArrayList;

public class MyCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Barnaul");
		cities.add("Dumshambn");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		cities.add("Baku");
		
		// print each city using for each loop
		 for(String city:cities) {
			 System.out.print(city+" ");
		 }
		System.out.println();
		
		//print each city using for  loop 
		for(int i=0;i<cities.size();i++) {
			System.out.print(cities.get(i)+ " ");
		}
		
		System.out.println();
		// remove Baku
		System.out.println("Removing Baku");
		cities.remove("Baku");
		cities.remove("New York");// it will not remove or show error
		System.out.println();
		System.out.println(cities.toString());
		
		//isEmpty?
		System.out.println("Is it empty? "+ cities.isEmpty());
		cities.add(0,"Bishkek"); //adding Bishkek to the beginin 
		System.out.println(cities.toString());
		cities.add(1,"Istambul"); //adding Istambul to the beginin  
		System.out.println(cities.toString());
		cities.set(2, "Seoul");// this method will replase old index with new one
		System.out.println(cities.toString());
		int idxC= cities.indexOf("Sterling");
		System.out.println("Sterling index: "+ idxC);
		cities.set(idxC, "Zagreb");
		System.out.println(cities.toString());
		cities.clear(); // remove all values from the list
		boolean empty = cities.isEmpty(); // checks if the ArrayList is empty or not. return boolean value
		System.out.println("empty: "+empty);

		
		String db = "1test#2bla#3foo", data = "bbb"; String op ="edit";String id = "2";
		int fd=db.indexOf("#");
		db=db.replace(db.substring(db.indexOf(id)+1,db.indexOf("#",fd+1)),data);
		System.out.println(db);
		int sd = db.indexOf("#",fd+1);
		
		
	}

}
