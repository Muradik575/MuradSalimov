package day8_FlowControl;

public class IfElseWithVariabels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temperatura = 65;

		if(temperatura >= 65) {
			System.out.println("Its nice day");
		} else {
			System.out.println("stay home code Java");
		}
		
		int teamAScore = 5;
		int teamBScore = 9;
			// 5			9
		if(teamAScore > teamBScore) {
			System.out.println("Team A won! ");
			System.out.println("Go team A! ");
		}else {
			System.out.println("Team B won or it was adraw ");
			System.out.println("Go Teams! ");
		}
		
		

	}

}
