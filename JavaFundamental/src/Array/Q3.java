package Array;
import java.util.*;

public class Q3 {
	public static void main(String[] args) {
		  int arr[]=new int[] {10,34,56,78,46,49};
	        int index = -1;
	        Scanner s = new Scanner(System.in);
	        int number = s.nextInt();
	        for(int i=0;i<arr.length;i++) {
	            if(arr[i] == number) {
	                index = i+1;
	                break;
	            }
	        }
	        System.out.println(index);
		 
		}

}
