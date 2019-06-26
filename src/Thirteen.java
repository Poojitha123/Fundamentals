class Thirteen
{
   public static void main (String[] args)
   {		
       int i =0;
       int n =0;
       String  prime = "";
       for (i = 10; i <= 99; i++)         
       { 		  	  
          int c=0; 	  
          for(n =1; n<=i; n++)
	  {
             if(i%n==0)
	     {
 		c = c + 1;
	     }
	  }
	  if (c==2)
	  {
	     prime = prime+i+" ";
	  }	
       }	
       System.out.println(prime);
   }
}