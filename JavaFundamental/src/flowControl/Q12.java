package flowControl;

public class Q12 {
	public static void main(String[] args) {
	    int num=Integer.parseInt(args[0]);
	    boolean flag=false;
	    for(int i=2;i<=num/2;i++)
	    {
	        if(num%i==0)
	        {
    	        flag=true;
    	        break;
	        }
	    }
	    if(!flag)
	    {
	        System.out.println(num+" is a prime number");
	    }else{
	        System.out.println(num+" is a not prime number");
	        
	    }
	}

}
