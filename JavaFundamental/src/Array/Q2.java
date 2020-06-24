package Array;
import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		  int arr[]=new int[] {1,8,6,9,5,4,3};
		  Arrays.sort(arr);
		  int sizeArr=arr.length;
		  int min=arr[0];
		  int max=arr[sizeArr-1];
		  System.out.println("Maximum value of array is "+max+" and minimum value of array is "+min);
		}

}
