class Six{
public static void main(String args[]){
String gender=args[0];
int age=Integer.parseInt(args[1]);
if(gender.equals("Female") && (1<=age && age<=58)){
System.out.print("percentage of interest is 8.2%");
}
else if(gender.equals("Female")  && (59<=age && age<=100)){
System.out.print("percentage of interest is 9.2%");
}
else if(gender.equals("Male")  && (1<=age && age<=58)){
System.out.print("percentage of interest is 8.4%");
}
else if(gender.equals("Male") && (59<=age && age<=100)){
System.out.print("percentage of interest is 10.5%");
}
else{
System.out.print("Invalid entry");
}
}
}