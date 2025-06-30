package Oops;
public class GetterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        // p1.settipfun(4);
        System.out.println(p1.getTip());
        p1.settipfun(5);
        System.out.println(p1.getTip());
        p1.setcolor("black");
        System.out.println(p1.getcolor());

        p1.setPass("slfkdflksadf");
        System.out.println(p1.getPass());

    }
}

class Pen {
    private String color;
    private int tip;
    private String password;

    String getPass() {
        return this.password;
    }

    void setPass(String password) {
        this.password = password;
    }
    
    //getter
    String getcolor() {
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setcolor(String newcolor) {
        this.color = newcolor;
    }

    void settipfun(int newtip) {
        this.tip = newtip;
    }
}
