package Oops;
public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "raja";
        s1.roll = 111;
        s1.password = "fsf";
        s1.marks[0] = 99;
        s1.marks[1] = 98;
        s1.marks[2] = 94;

        Student s2 = new Student(s1);// output same hi aana chaiye hai 99, 98 94 ager eske bad s1 me marks ko change kr
        // kre to but uske bad bi s2 me change reflect kr rha hai because array work on as refrence 
        // to dono ak hi --- array ko point kr rha hai b/C of refrence
        s1.marks[1] = 100; 
        s2.password = "ajay";
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);// 99,100,94 
            // es problem ko ham solve krte hai  deep copy  mathod se 
        }
        
    }
}

class Student {
    String name;
    String password;
    int roll;
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("helolo");
    }

    // shallow deep copy method aries problem 
    //    Student(Student s1) {
    //        this.name = s1.name;
    //        this.roll = s1.roll;
    //        this.marks = s1.marks;
    //    }

    
    // solution of shallow copy pbm
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {// yeha ab changes reflect nhi kr rhe hai prb resolve;
            this.marks[i] = s1.marks[i];
        }
    }

}
