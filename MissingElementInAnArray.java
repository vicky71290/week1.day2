package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public void arry() {

		int[] arr = {1,2,3,4,7,6,8,5,10}; 
		Arrays.sort(arr);
		int len = arr.length;

		for(int i=arr[0];i<=len;i++) { 

			if (i!=arr[i-1]) { 

				System.out.println("Missing Number is " + i);
				break;
			}

		}

	}
	public static void main(String[] args) {

		MissingElementInAnArray missnum = new MissingElementInAnArray();
		missnum.arry();

	}

}