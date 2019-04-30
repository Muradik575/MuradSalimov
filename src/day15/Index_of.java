package day15;

public class Index_of {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "java";
		
		str.indexOf("j"); //0
		str.indexOf("v");//2
		str.indexOf("a");//1

		            // 012345
		String word1 = "github";
		System.out.println(word1.indexOf('g'));//0
		System.out.println(word1.indexOf("th"));//2
		System.out.println(word1.indexOf("hub"));//3

		System.out.println(word1.indexOf("java"));

		
		String url = "www.okta.com";
		
		int i = url.indexOf(".");
		System.out.println("Post of . :" + i);
		System.out.println(url.charAt(i+1));
		
		String title = "Java - Google Search";
		 int b = title.indexOf("-");
		 System.out.println(title.charAt(b -1));
		System.out.println(title.charAt(b+1));
		
		String country = "Unuted States of America";
		
		int states = country.indexOf("States");
		System.out.println("position of states: " + states);
		
		String word2 = "java, c++, python,tomcat,eclipce";
		
		
		if (word2.contains("c++")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
		int m = word2.indexOf("c++");
		System.out.println(m);
		
		
			
		
		}
		
	}


