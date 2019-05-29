package day_44_Encapsulation_Cunstructor;

public class WhatsAppMessages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WhatsApp  wapp =new  WhatsApp("703-333-4321","Godd for you");
		WhatsApp  wapp2 =new  WhatsApp("347-689-1211",true);
		
		System.out.println(wapp2.toString());
		
	}

}
