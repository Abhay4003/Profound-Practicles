import java.util.*;

class Student {
    private int rollno;
    private String name;
    private double marks;

    public Student() {}

    public Student(int rollno, String name, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "\n Roll no=" + rollno
            + "\n Name=" + name
            + "\n Marks=" + marks;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

public class StudentArry {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        Student arr[] = new Student[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();

            System.out.println("Enter Rollno:");
            arr[i].setRollno(sc.nextInt());

            System.out.println("Enter name:");
            sc.nextLine();  // Consume newline character
            arr[i].setName(sc.nextLine());

            System.out.println("Enter marks:");
            arr[i].setMarks(sc.nextDouble());  
        }

        for (Student s : arr) {
            System.out.println(s); 
        }
    }
}
