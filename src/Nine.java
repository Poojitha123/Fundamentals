public class Nine {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("Please enter the month in numbers");
		}
		int chr=Integer.parseInt(args[0]);
		switch(chr) {
		case 1:System.out.println("Jan");
		break;
		case 2:System.out.println("Feb");
		break;
		case 3:System.out.println("mar");
		break;
		case 4:System.out.println("Apr");
		break;
		case 5:System.out.println("May");
		break;
		case 6:System.out.println("June");
		break;
		case 7:System.out.println("July");
		break;
		case 8:System.out.println("Aug");
		break;
		case 9:System.out.println("Sep");
		break;
		case 10:System.out.println("Oct");
		break;
		case 11:System.out.println("Nov");
		break;
		case 12:System.out.println("Dec");
		break;
		default:System.out.println("Invalid month");	
		}
	}

}
