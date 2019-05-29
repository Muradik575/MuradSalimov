package day_49_Inharitance02;

public class BarnesAndNobels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         EBook ebook = new EBook();// object type accsesibilaty 
         ebook.setTitle("Introductioj to Java programing");
         ebook.setAuthor("Savitch");
         ebook.setPages(1016);
         ebook.setPrice(170);
         ebook.setSize(500);
         ebook.setType("Tech Book");
         ebook.readEBook(10);
         ebook.readEBook(621);
         
         System.out.println(ebook.getTitle());
         System.out.println(ebook.getAuthor());

         
          AudioBook aBook = new AudioBook();
          aBook.setTitle("OCA Preparation");
          aBook.setAuthor("Jannet");
          aBook.setNarrator("Marofjon");
          aBook.listen();
          
         
          PaperBack pb  = new PaperBack();
          pb.setAuthor("Malcom Gladwell");
          pb.setTitle("Outliers");
          pb.setType("Biography");
          pb.setPrice(20);
          pb.setPages(304);
          
          System.out.println(pb.toString());
          
         
         
         
         
         
         
         
         
         
         
	}

}
