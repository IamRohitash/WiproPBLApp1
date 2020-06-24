package flowControl;

public class Q17 {
	 public static void main (String[] args)
	  {
	  
	         int num=Integer.parseInt(args[0]);
	         int temp=num;
	         int reverseNo=0;
	         while(num>0)
	         {
	            int ldigit=num%10;
	            reverseNo=reverseNo*10+ldigit;
	            num=num/10;
	         }
	         if(temp==reverseNo)
	         {
	             System.out.println(temp+" is a palindrome");
	         }
	         else{
	             System.out.println(temp+" is not a palindrome");
	         }
	  }

}
