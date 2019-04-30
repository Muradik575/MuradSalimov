package day7;

public class PreAndPost2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int messages = 10;
		messages++; // 11
		++messages; // 12
		System.out.println("Messages: " + messages);
		
		int redMessages = --messages;
		System.out.println("Red Messages " + redMessages);
		System.out.println("Messages" + messages);
		
		int unredMessages = redMessages--;
		
		System.out.println("unredMessages " + unredMessages); //11
		System.out.println("redMessages" + redMessages);//10
		
		int total = unredMessages++ - redMessages--;
		
		System.out.println("unredMessages: " + unredMessages);  //12
		System.out.println("redMessages: " + redMessages); //9
		System.out.println("total: " + total); //1
		
		int count = 20;
		int count2 =10;
		int totalCount = ++count + --count2;
		System.out.println("count: "+ count); //21
		System.out.println("count2: "+ count2); //9
		System.out.println("total count: " + totalCount ); //30
		
		
			//44	   //22  	+(+1)+23
		int muCount = count++ + ++count;
		
		System.out.println("count: " + count);
		System.out.println("myCount: " + muCount);
		
		
		
		
		
		
		
		
		
		
		
	}

}
