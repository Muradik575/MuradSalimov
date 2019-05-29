package day_44_Encapsulation_Cunstructor;
import java.util.*;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jobs job1 = new Jobs();
		Jobs job2 = new Jobs("Java Developer");
		Jobs job3 = new Jobs("SDET","Amazon",130000);
	
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		// create s list of jobs and add 5 diferent jobs with company salary and title
		List<Jobs> jobsList = new ArrayList<>();
		
		jobsList.add(job3);
		jobsList.add(new Jobs("Scrum Master","Google",123000));
		jobsList.add(new Jobs("SDET","FreddieMac",115000));
		jobsList.add(new Jobs("BA","Leidos",98000));
		jobsList.add(new Jobs("Senior QA Tester","Delata",150000));
		
		System.out.println(jobsList.toString());
		// find the highest payying job and print toString for that
		double maxSalary=0;
		int highestiIndex = -1;
		
		for(int i =0;i<jobsList.size();i++) {
			if(jobsList.get(i).getAnnualSalary()>maxSalary) {
				maxSalary=jobsList.get(i).getAnnualSalary();
				highestiIndex=i;
			}
		}
		Jobs bestJob=jobsList.get(highestiIndex); 
		System.out.println("Highest Salary; "+bestJob.toString());
		
	}

}
