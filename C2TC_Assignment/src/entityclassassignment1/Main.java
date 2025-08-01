package entityclassassignment1;

class Main {
	
	 public static void main(String[] args) 
	 {
	        Student s1 = new Student("Gokul", 20, "IT");
	        Student s2 = new Student("Anu", 21, "CSE");
	        Student s3 = new Student("Raj", 22, "ECE");

	        System.out.println("Student Details:");
	        s1.display();
	        s2.display();
	        s3.display();
	  }
}