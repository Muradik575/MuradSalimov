package day42_CustomClasses_Encapsulation;

import java.util.*;

public class DSWShoeStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shoes s1 = new Shoes();
		s1.setShoesData("Aldo", 6.5);
		System.out.println(s1.getShoesData());

		Shoes s2 = new Shoes();
		s2.setShoesData("Boss Hugo Boss", 12);

		Shoes s3 = new Shoes();
		s3.setShoesData("adidas", 6.5);

		Shoes[] shoesArr = new Shoes[3];
		shoesArr[0] = s1;
		shoesArr[1] = s2;
		shoesArr[2] = s3;
		System.out.println(shoesArr[0].getShoesData());
		System.out.println(shoesArr[1].getShoesData());
		System.out.println(shoesArr[2].getShoesData());

		System.out.println(shoesArr[0].brand);// gives only brand name at the spesific index
		System.out.println(shoesArr[1].brand);// gives only brand name at the spesific index
		System.out.println(shoesArr[2].brand);// gives only brand name at the spesific index

		// ArrayList of Shoes
		ArrayList<Shoes> myShoes = new ArrayList<>();// this Array list can store objectc only
		myShoes.add(s1);
		myShoes.add(s2);
		myShoes.add(s3);
		System.out.println(myShoes.get(0).getShoesData());
		System.out.println(myShoes.get(1).getShoesData());
		System.out.println(myShoes.get(2).getShoesData());

		System.out.println(myShoes.get(0).size);
		System.out.println(myShoes.get(1).size);
		System.out.println(myShoes.get(2).size); // gives only size at the spesific index

		Shoes redShoes = myShoes.get(1); // to read and store in the one object into another variable , data tayp have
											// to object type
		System.out.println(redShoes.getShoesData());

		// lets use for each loop and print data for each data

		for (Shoes shoe : myShoes) {
			System.out.println(shoe.getShoesData());
		}
		// print name of the Shoes in the list that size more than 7

		for (Shoes show : myShoes) {
			if (show.size > 7.0) {
				System.out.println(show.brand);
			}
		}

	}

}
