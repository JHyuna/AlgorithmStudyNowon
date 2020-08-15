package 배열;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 두수의합 {
	
	// 첫번째 방법 
	public int[] twoSum(int[] nums, int target) {
		int[] sum = new int[2];
		int k = 0;
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i] + nums[j] == target) {
					sum[0] = i;
					sum[1] = j;
				}
			}
		}
		return sum;
	}
	
	// 해쉬 테이블 이용 - target에서 nums의 요소 빼고 그것이 map에 존재하는지
	public int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], i);
		}
		for(int i=0;i<nums.length;i++) {
			int complement = target-nums[i];
			if(map.containsKey(complement)) {
				return new int[] {i,map.get(complement)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	//1회 통과 해시 테이블 - 
	public int[] twoSum3(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			}
			map.put(nums[i],i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	// 만약 nums가 오름차순으로 주어진다고 한다면 이 풀이도 가능
	public int[] twoSum4(int[] nums, int target) {
		int left=0,right = nums.length - 1;
		Arrays.sort(nums);
		while( left != right ) {
			//합이 타켓보다 작으면 왼쪽 포인터를 오른쪽으로
			if(nums[left] + nums[right] < target) {
				left+=1;
			// 합이 타켓보다 크면 오른쪽 포인터를 왼쪽으로
			}else if(nums[left] + nums[right] > target) {
				right -= 1;
			}
			else {
				return new int[] {left, right};
			}
		}
		return new int[] {};
	}
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		두수의합 sum = new 두수의합();
		for(int i=0;i<sum.twoSum(nums, target).length;i++) {
			System.out.print(sum.twoSum4(nums, target)[i]);
		}
		
	}

}
