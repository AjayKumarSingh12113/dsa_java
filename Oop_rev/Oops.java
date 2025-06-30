package Oop_rev;

public class Oops {
    static class Student{
        String stname;
        int stid;
        String stcity;

        public Student(){
            System.out.println("showing student detials non parametisized constr");
        }
        public Student(String st, int id, String city){
            this.stname=st;
            this.stid = id;
            this.stcity = city;
        }

    }
    public static void main(String[] args) {
        //Student s1 = new Student("ajay",12 ,"delhi");
    }
}
