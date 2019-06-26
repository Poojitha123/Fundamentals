public class Twelve {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        boolean flag = false;
        if(n==0||n==1)
        	System.out.println(n+"not a prime");
        for(int i = 2; i <= n/2; i++)
        {
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (flag!=true)
            System.out.println(n+" is a prime");
        else
            System.out.println(n+" is not a prime");
    }
}