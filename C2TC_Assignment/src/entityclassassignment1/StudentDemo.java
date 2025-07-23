package entityclassassignment1;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", "Chennai");
        Student s2 = new Student(102, "Bob", "Coimbatore");
        Student s3 = new Student(103, "Charlie", "Madurai");

        System.out.println("Student Details:");
        s1.display();
        s2.display();
        s3.display();
    }
}