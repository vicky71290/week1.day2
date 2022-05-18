package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] arry1 = {3,2,11,4,6,7};
		int[] arry2 = {1,2,8,4,9,7};
		
		int len1 = arry1.length;
		int len2 = arry2.length;
		
		
		for (int i=0;i<=len1-1;i++) {
			
			for (int r=0;r<=len2-1;r++) {
				
				if (arry1[i] == arry2[r]) {
					
					System.out.println("Intersecting number between the arrays is " + arry1[i]);
				}
			}
			
		}

	}

}

