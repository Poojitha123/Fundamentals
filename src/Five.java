class Five{
public static void main(String args[]){
char c='5';
if((c>='A' && c<='Z')||(c>='a' && c<='z')){
System.out.print("Alphabhet");
}
else if(c>='0' && c<='9'){
System.out.print("Digit");
}
else{
System.out.print("Special Character");
}
}
}