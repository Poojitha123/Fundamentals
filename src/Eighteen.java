public class Eighteen {
public static void main(String[] args) {
	int temp,sum=0;
	int n=Integer.parseInt(args[0]);
	temp=n;
	while(n!=0) {
		int a=n%10;
		sum=sum*10+a;
		n=n/10;
	}
	if(temp==sum) {
		System.out.println(temp+" is a palindrome number");
	}
	else {
		System.out.println(temp+" is not a palindrome number");
	}
}
}
