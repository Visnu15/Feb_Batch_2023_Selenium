package org.student;

import org.department.Department;

public class Student extends Department {
public void studentName() {
	String name = "Visnu";
	System.out.println("Student name: " + name);
}
public void studentDept() {
	String dept = "Mechatronics";
	System.out.println("Student dept: " + dept);
}
public void studentId() {
	int id = 12345;
	System.out.println("Student Id: " + id);
}
public static void main(String[] args) {
	Student info = new Student();
	info.collegeName();
	info.collegeCode();
	info.collegeRank();
	info.deptName();
	info.studentName();
	info.studentDept();
	info.studentId();
}
}
