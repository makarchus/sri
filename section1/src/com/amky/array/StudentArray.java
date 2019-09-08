package com.amky.array;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] studentArray = new Student[5];
		Student student = new Student();
		
		studentArray[0] = new Student(1, "Makarand", "Kulkarni", "425 Pierce Dr");
		studentArray[1] = new Student(2, "Alex", "Smith", "Florida");
		studentArray[2] = new Student(3, "John", "Doe", "Mountain View");
		
		
		for(int i=0;i<3;i++){
			System.out.println("First Name:"+ studentArray[i].firstName);
		}

		System.out.println(student.findStudent(studentArray, 1).firstName);
	}

}
