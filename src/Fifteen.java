public class Fifteen {
public static void main(String[] args) {
	int sum=0;
	int n=Integer.parseInt(args[0]);
	for(;n>0;) {
		int a=n%10;
		sum=sum+a;
		n=n/10;
	}
	System.out.print(sum);
}
}
