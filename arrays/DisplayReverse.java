package arrays;

public class DisplayReverse {
	
	public static void displayReverse(int[] arr, int index) {
		
		if(index==arr.length) {
			return;
		}
		displayReverse(arr,index+1);
		System.out.println(arr[index]);

	}
	
	public static void main(String[] args) {
		int[] arr = {14,26,8,1992,1997};
		displayReverse(arr, 0);
	}
}
