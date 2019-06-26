public class Nineteen {
public static void main(String[] args) {
	int i=1;
	int count=0;
	while(i>0) {
		if(i%2==0 && i%3==0 && i%5==0) {
			System.out.print(i+"\t");
			count++;
		}
		if(count==5) {
			break;
		}
		i++;
	}
	
}
}
