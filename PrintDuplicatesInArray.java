package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] data = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len = data.length;
		int count;
		
		for (int i=0;i<len-1;i++) {
			count=0;
			for (int r=i+1;r<len;r++) {
				if (data[i] == data[r]) {
					count = count+1;
				}
				
			}
			
			if(count>0) {
				System.out.println(data[i]);
			}
		
		}
				
		
	}

}
