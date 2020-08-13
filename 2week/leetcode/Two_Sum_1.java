package week2;

public class Two_Sum_1 {

	public static void main(String[] args) {

	}

	public static int[] twoSum(int[] nums, int target) {
		int[] answer = new int[2];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i == j) {
					continue;
				}
				sum = nums[i] + nums[j];
				if (target == sum) {
					answer[0] = i;
					answer[1] = j;
					return answer;
				}
				
				
			}
		}
		return answer;
	}

}