package flowControl;

public class Q16 {
	public static void main (String[] args)
	  {
	  
	         int num=Integer.parseInt(args[0]);
	         int reverseNo=0;
	         while(num>0)
	         {
	            int ldigit=num%10;
	            reverseNo=reverseNo*10+ldigit;
	            num=num/10;
	         }
	         System.out.println(reverseNo);
	  }

}
