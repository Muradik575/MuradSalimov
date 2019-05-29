package day_39_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");
        cities.add("Lima");
        
        
        //1) FPR LOOP: Print each city in sane line seperated by |
        for(String f : cities) {
        	System.out.print(f+"|");
        }
        System.out.println();
        //2) FPR LOOP: Print each city in sane line seperated by |
        for(int i =0;i<cities.size();i++) {
        	System.out.print(cities.get(i)+"|");
        }
        System.out.println();
        //3) ToString. method  Print cities all  upper case
        System.out.println(cities.toString().toUpperCase());
        
        System.out.println();
        
        
        //4) Make each city all uppercase
        for(int i =0; i <cities.size();i++) {
        cities.set(i, cities.get(i).toUpperCase());
        System.out.print(cities.get(i)+"|");
        }
        System.out.println();
        
        for(int j = 0; j < cities.size(); j++) {
    		String city = cities.get(j).toUpperCase();
    		cities.set(j, city);
    }
        
       // Collections.sort(cities);
        System.out.println(cities);
        
      //Find the longest and shortest cities.
        String longestCity = "", shortestCity = "";
        
        for(String city : cities) {
                if(city.length() > longestCity.length()) {
                    longestCity = city;
                }
        }
        shortestCity = cities.get(0);
        for(String city : cities) {
                if(city.length() < shortestCity.length()) {
                    shortestCity = city;
                }
        }
        
        System.out.println("longestCity: " + longestCity);
        System.out.println("shortestCity: " + shortestCity);

      ArrayList<String>citiesMoreThan6 = new ArrayList<>();
      // assign cities 
      
      for(String ct: cities) {
    	  if(ct.length()>6) {
    		  citiesMoreThan6.add(ct);
    	  }
      }
      
      System.out.println(citiesMoreThan6);
      
      
      
	}
}
