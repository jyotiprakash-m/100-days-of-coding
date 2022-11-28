package arrays;

public class Arrays12 {

	public static void main(String[] args) {
		int arr[] = {3, 5, 4, 1, 9};
		int max_val= Integer.MIN_VALUE;
		int min_val= Integer.MAX_VALUE;
		
		for(int i : arr) {
			if(i>max_val) {
				max_val=i;
			}
			if(i<min_val) {
				min_val = i;
			}
		}
		System.out.println("Max value: "+max_val);
		System.out.println("Min value: "+min_val);
	}

}
