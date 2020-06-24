package flowControl.flowControl1;

public class Q1 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if(a>0)
		{
		    System.out.println(a+" is a positive number");
		}
		else if(a<0)
		{
		    System.out.println(a+" is a negative number");
		}
		else
		{
		    System.out.println("Number is a Zero");
		}
	}

}
