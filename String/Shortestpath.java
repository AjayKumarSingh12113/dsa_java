package String;
public class Shortestpath {
    public static int shortestpath(String dis) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < dis.length(); i++) {
            char dir = dis.charAt(i);
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        return (int) Math.sqrt((x * x) + (y * y));

    }

    public static void largestString(String str[]) {
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }

        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String dis = "WNEENESENNN";
        System.out.println(shortestpath(dis));
        String s1 = "ajay";
        String s2 = "ajay";
        String s3 = new String("ajay");
         // yeh sare type or value pe depend krta hai 
        if (s1==s2) {
            System.out.println("string is equeal");
        } else {
            System.out.println("string is not equal");
        }
        if (s1==s3) {
            System.out.println("string is equeal");
        } else {
            System.out.println("string is not equal");
        }
        // yeh only value ke depend se kaam krta hai 
        if (s1.equals(s3)) {
            System.out.println("both are equeals");
        } else {
            System.out.println("not equals");
        }
        // substring functions
        System.out.println(s1.substring(0, 3));
        // to campare 
        String one[] = { "ajay", "raja", "mohan" };
        largestString(one);

    }
}
