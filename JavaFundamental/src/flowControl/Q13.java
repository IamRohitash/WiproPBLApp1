package flowControl;

public class Q13 {
public static void main(String[] args) {
	    
	    
	    for(int a=10;a<=99;a++)
	    {
	        boolean flag=false;
        	    
        	    for(int i=2;i<=a/2;i++)
        	    {
        	        
        	        
        	        if(a%i==0)
        	        {
            	        flag=true;
            	        break;
        	        }
        	         
        	  }
        	  if(!flag)
        	  {
        	   System.out.println(a+" is a prime number");
        	   }
        	   else
        	   {
        	   System.out.println(a+" is a not prime number");
        	   }
        	    
	    }	    
	   
	}

}
