public class FriendsPairing {
    public static int friendpairing(int n) {
        if (n==1 || n==2) {
            return n;
        }
        int fnm1 = friendpairing(n - 1);
        int fnm2 = friendpairing(n - 2);
        return fnm1 + fnm2*(n-1);
    }

    public static void main(String[] args) {
        System.out.println(friendpairing(3));
        
        
    }
}
