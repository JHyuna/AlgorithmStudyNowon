package 배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 세 수를 더해서 0이 되도록
public class 세수의합 {
	public List<List<Integer>> threeSum(int[] nums) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length-2;i++) {
			// 중복된 값 건너뜀
			if(i > 0 && nums[i] == nums[i-1]) {
				continue;
			}
			for(int j=i+1;j<nums.length-1;j++) {
				if(j > i+1 && nums[j] == nums[j-1]) {
					continue;
				}
				for(int k=j+1;k<nums.length;k++) {
					if(k>j+1 && nums[k] == nums[k-1]) {
						continue;
					}
					if(nums[i] + nums[j] + nums[k] == 0) {
						result.add(Arrays.asList(nums[i],nums[j],nums[k]));
					}
				}
			}
		}
		return result;
	}

	public List<List<Integer>> threeSum2(int[] nums) {
		int sum = 0;
		List<List<Integer>> results = new ArrayList<>();
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length-2;i++) {
			if(i>0 && nums[i] == nums[i-1]) {
				continue;
			}
			
			int left=i+1, right=nums.length-1;
			while(left < right) {
				sum = nums[i] + nums[left] + nums[right];
				if(sum < 0) {
					left += 1;
				}else if(sum >0) {
					right -= 1;
				}else {
					results.add(Arrays.asList(nums[i],nums[left],nums[right]));
					
					while(left < right && nums[left] == nums[left+1]) {
						left+=1;
					}
					while(left < right && nums[right] == nums[right-1]) {
						right-=1;
					}
					left+=1;
					right-=1;
				}
			}
		}
		return results;
	}
	
	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		세수의합 see = new 세수의합();
		System.out.print(see.threeSum2(nums));
	}

}
