package Array;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Q7
{
	public static void main(String[] args) {
	  int arr[]=new int[] {68,90,97,104,90,5,7,9,10,97,9,10,120};
	  List<Integer> distinctArray=new ArrayList<>();
	  for(int val:arr)
	  {
	      if(!distinctArray.contains(val))
	      {
	          distinctArray.add(val);
	      }
	  }
	  System.out.println(Arrays.toString(distinctArray.toArray()));
	  
	}    
}