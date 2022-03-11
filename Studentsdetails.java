package week3.day1;

public class Studentsdetails extends Department{
	
			public void studentName() {
				System.out.println("Student Name is : " + "Vidya");
			}
			
			public void studentDept() {
				System.out.println("Student Department is " + "BE");
			}
			
			public void studentId() {
				System.out.println("Student Id is :" + "3");
			}
			
			public static void main(String[] args){
				Studentsdetails stud = new Studentsdetails();
				stud.collegeName();             //College
				stud.collegeCode();
				stud.collgeRank();
				
				stud.deptName();              //Department
				
				stud.studentId();
				stud.studentName();          //Student
				stud.studentDept();
				
			}
	
}