package arrays;

// Maximum sum sub array
public class Arrays14 {
	public static void main(String[] args) {
		int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		// using Kadane's Algorithm
		int sum = 0;
		int max_sum = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			sum = sum+nums[i];
			max_sum = Math.max(sum,max_sum);
			if (sum < 0)
				sum = 0;
		}
		
		System.out.println(max_sum);
	}
}
