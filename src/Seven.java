public class Seven {
	public static void main(String[] args) {
		char ch='A';
		if(ch>='a' && ch<='z')
			System.out.println(ch+"->"+Character.toUpperCase(ch));
		else if(ch>=65 && ch<=90)
			System.out.println(ch+"->"+Character.toLowerCase(ch));
	}

}
