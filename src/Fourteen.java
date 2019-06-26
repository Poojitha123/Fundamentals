public class Fourteen {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        if(args.length==0)
            System.out.print("Please enter an integer number ");
        boolean flag = false;
        if(n==0||n==1)
        	System.out.println(n+" is neither prime nor composite");
        for(int i = 2; i <= n/2; i++)
        {
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (flag!=true)
            System.out.println(n+" is not a prime number");
        else
            System.out.println(n+" is a prime number");
    }
}