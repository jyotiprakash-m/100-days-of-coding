package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays15 {
	public static void main(String[] args) {
		int nums[] = {1,2,3,1};
		Arrays.sort(nums);
		ArrayList<Integer> non_duplicate_nums = new ArrayList<>();
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i+1]!=nums[i]) {
				non_duplicate_nums.add(nums[i]);
			}
		
		}
		System.out.println(non_duplicate_nums);
	}
}
