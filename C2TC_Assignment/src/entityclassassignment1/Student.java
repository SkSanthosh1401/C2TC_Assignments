package entityclassassignment1;

public class Student {
    public int id;
    public String name;
    public String city;

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", City: " + city);
    }
}