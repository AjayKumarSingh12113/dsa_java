package Oops;
public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("raja");
        System.out.println(s1.name);
        Student s2 = new Student();
        Student s3 = new Student(123);
        System.out.println(s3.rollno);

    }
}

class Student {
    String name;
    int rollno;

    Student() {
        System.out.println("hello world");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.rollno = roll;
    }
}
