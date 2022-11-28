package arrays;

public class Arrays13 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
		int si = 0;
		int ei = arr.length-1;
		while(ei>si) {
			// Swapping
			int temp = arr[si];
			arr[si]=arr[ei];
			arr[ei] = temp;
			si++;
			ei--;
		}
		
		for(int i :arr) {
			System.out.println(i);
		}
	}
}
