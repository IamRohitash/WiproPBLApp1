package flowControl;

public class Q14 {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int sum=0;
		while(num>0)
		{
		    int ldigit=num%10;
		    sum=sum+ldigit;
		    num=num/10;
		}
		System.out.println(sum);
	}

}
