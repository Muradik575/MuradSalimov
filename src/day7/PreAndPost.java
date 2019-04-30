package day7;

public class PreAndPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 0;
int num2 = num++;

System.out.println("num: " + num);
System.out.println("num2: " + num2);

int n = 20;
int n2 = ++n;
System.out.println("n: " + n);
System.out.println("n2: " + n2);

int i = 10;
i++; // add1
++i; // add1

System.out.println("I value: " + i);

int b = 10;
int b2 = b++;

System.out.println("b: " + b);
System.out.println("b2: " + b2);


int bananas =6;
int pears = bananas++;
int apples = ++bananas;

System.out.println("bananas: " + bananas);
System.out.println("pears: " + pears);
System.out.println("apples: " + apples);


int bananas1 =6;
int pears1 = ++bananas1;
int apples1 = bananas1++;

System.out.println("bananas1: " + bananas1);
System.out.println("pears1: " + pears1);
System.out.println("apples1: " + apples1);


int friends = 10;
System.out.println("friends " + friends++);
System.out.println(friends);

int friends1 = 10;
System.out.println("friends " + "" + ++friends1);
System.out.println(friends1);

int p1 = 10;
int sum = p1++ +5;
// p1+5 add assign to sum
// p1 = p1 + 1
System.out.println("sum: " + sum);
System.out.println("p1: " + p1);

int batteries =8;
int oldBatteries = 5;
int totalBatteries = batteries++ + ++oldBatteries;

System.out.println("batteries " + batteries); //9
System.out.println("oldBatteries "+ oldBatteries);// 6
System.out.println("totalBatteries " + totalBatteries);//14




















	} 

}
