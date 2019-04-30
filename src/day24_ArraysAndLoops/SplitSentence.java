package day24_ArraysAndLoops;

public class SplitSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int counter = 0;
		String sentence = "Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible.\n" + 
				"";
		
		String [] words= sentence.split(" "); // this is delimeter, 
		//System.out.println(words);
		
		for(String str : words) {
			System.out.println(str);
		}
//		if(str.equals("language")) {
//			break;
//		}
//		counter++;
//		}
//	System.out.println("Position: "+counter);
//		System.out.println(words[counter]);
//		
		
		String string="whatever";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println(reverse);	
		
		 String text = "abcdefghijklmnopqrstuvwxyz";

		    for (int i = (text.length() - 1); i >= 0; i--) {
		        System.out.print(text.charAt(i));
		    }
		
	
	
	
	
	}
		
		
	
	}


