package Oops;
public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
       // p1.settipfun(4);
        //System.out.println(p1.tip);
        p1.tip = 5;
        System.out.println(p1.tip);

        Bankaccount b1 = new Bankaccount();
        b1.username = "raja";
        System.out.println(b1.username);// esse yeh pata chala ki hum password change kr skte the only ...
        b1.setpassword("afsdfsf");
       // System.out.println(b1.password);// usko  es tarah to nhi dekh sakete hai the we use getter and setter.

    }
}

class Pen {
    String color;
    int tip;

    void setcolor(String newcolor) {
        color = newcolor;
    }

    void settipfun(int newtip) {
        tip = newtip;
    }
}

class Bankaccount {
    public String username;
    private String password;

    void setpassword(String pwd) {
        password = pwd;
    }
}
