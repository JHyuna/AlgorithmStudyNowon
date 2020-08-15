package 배열;

import java.util.Arrays;

public class 배열파티션I {
	
	public int arrayPairSum(int[] nums) {
		int sum = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2) {
        	System.out.print(Math.min(nums[i], nums[i+1]));
        	sum += Math.min(nums[i], nums[i+1]);
        }
        return sum;
    }
	
	//풀이 2
	public int arrayPairSum2(int[] nums) {
		int sum=0;
		int i=0;
		int[] pair = new int[nums.length];
		Arrays.sort(nums);
		
		for(int num : nums) {
			pair[i] = num;
			if(i % 2 != 0) {
				//System.out.println(i);
				sum += Math.min(pair[i],pair[i-1]);
			}
			i++;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {7,3,1,0,0,6};
		배열파티션I part = new 배열파티션I();
		System.out.print(part.arrayPairSum2(nums));
	}

}
