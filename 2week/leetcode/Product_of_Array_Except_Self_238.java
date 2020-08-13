package week2;

public class Product_of_Array_Except_Self_238 {

	public static void main(String[] args) {

	}

	public int[] productExceptSelf(int[] nums) {
		int[] answer = new int[nums.length];
		// 0이 2개 이상이면 정답배열은 모두 0
		int zeroNum = 0;
		// nums 배열의 숫자를 모두 곱함
		int multifly = 1;
		for (int num : nums) {
			if (num == 0) {	// 0있으면 제외함
				zeroNum++;
				continue;
			}
			multifly *= num;
		}

		// 각각의 숫자로 나눠줌
		if (zeroNum > 1) {	// 0이 하나이상 있으면 모두 0
			for(int i = 0; i < nums.length; i++) {
				answer[i] = 0;
			}

		} else if(zeroNum == 1) {	// 0이 하나면 제외하는  숫자가 0일때를 제외하고 모두 0 
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] == 0) {
					answer[i] = multifly;
				} else {
					answer[i] = 0;
				}
			}
			
		} else {	// 0이 없는 경우 모두 곱한값에서 제외하는 값으로 나눠줌
			
			for (int i = 0; i < nums.length; i++) {

				answer[i] = multifly / nums[i];
			}
		}

		return answer;

	}

}
