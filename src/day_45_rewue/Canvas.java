package day_45_rewue;

import java.util.*;

public class Canvas {

	public static void main(String[] args) {
	
		Course course1 = new Course();
		course1.setName("Java Programing");
		List<String> javaTeachers = new ArrayList<>();
		javaTeachers.add("Vasyl");
		javaTeachers.add("Murodil");
		javaTeachers.add("Marufjon");
		javaTeachers.add("Muhtar");

		course1.setTeachers(javaTeachers);
		System.out.println(course1.toString());

		List<String> javaStrudents = new ArrayList<>();
		javaStrudents.add("Murad");
		javaStrudents.add("Murat");
		javaStrudents.add("Sung");
		javaStrudents.add("Jonghee");
		javaStrudents.add("Pavel");
		course1.setStudents(javaStrudents);
		System.out.println(course1.toString());

		course1.addTeacher("Maria");
		course1.addStudent("Ekaterina");

		if (course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is a teacher");
		} else {
			System.out.println("Maria is not a teacher");
		}

		if (course1.getStudents().contains("Ekaterina")) {
			System.out.println("Ekaterina is a strudent");
		} else {
			System.out.println("Ekaterina is not a student");
		}

		course1.removeStudent("Song");
		course1.removeTeacher("Maria");
		
		if(!course1.getTeachers().contains("Maria")) {
			System.out.println("Maria remover sucsesfuly");
		}else {
			System.out.println("Maria is not a teacher");
		}
		
		if(!course1.getStudents().contains("Song")) {
			System.out.println("Song remover sucsesfuly");
		}else {
			System.out.println("Song is not a student");
		}
		
	}

}
