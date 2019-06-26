public class Seventeen {
    public static void main(String[] args) {
        int n =Integer.parseInt(args[0]);
        int rev = 0;
        while(n != 0) {
            int i = n % 10;
            rev = rev * 10 + i;
            n= n/10;
        }
        System.out.println(rev);
    }
}