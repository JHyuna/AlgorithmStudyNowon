package 배열;

public class 자신을제외한배열의곱 {
	// 내 풀이
    public int[] productExceptSelf(int[] nums) {
    	int[] ans = new int[nums.length];
    	int mul = 1;
    	for(int i=0;i<nums.length;i++) {
    		for(int j=0;j<nums.length;j++) {
    			if(j == i) {
    				continue;
    			}
    			mul *= nums[j];
    		}
    		ans[i] = mul;
    		mul = 1;
    	}
    	return ans;
    }
    
    // 다른 방법1
    // 배열에 있는 모든 숫자의 곲을 주어진 인덱스의 숫자로 나눔. 
    // 만약 [4,5,1,8,2] 가 들어왓다면
    // [1,4,20,20,160] * [80,16,16,2,1] 으로 각 요소끼리의 곱
    public int[] productExceptSelf2(int[] nums) {
    	int length = nums.length;
    	
    	int[] L = new int[length];
    	int[] R = new int[length];
    	
    	int[] answer = new int[length];
    	
    	L[0] = 1;
    	for(int i=1;i<length;i++) {
    		L[i] = nums[i-1] * L[i - 1];
    	}
    	
    	R[length-1] = 1;
    	for(int i=length-2;i>=0;i--) {
    		R[i] = R[i+1] * nums[i+1];
    	}
    	
    	for(int i=0;i<length;i++) {
    		answer[i] = L[i] * R[i];
    	}
    	
    	return answer;
    }
    
    //다른 방법2 - 위 방식과 유사
    public int[] productExceptSelf3(int[] nums) {
    	
    	int length = nums.length;
    	
    	int[] answer = new int[length];
    	
    	answer[0] = 1;
    	for(int i=0;i< length;i++) {
    		answer[i] = nums[i-1] * answer[i-1];
    	}
    	
    	int R = 1;
        for (int i = length - 1; i >= 0; i--) {
        	 answer[i] = answer[i] * R;
             R *= nums[i];
        }
        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		자신을제외한배열의곱 me = new 자신을제외한배열의곱();
		for(int i=0;i<nums.length;i++) {
			System.out.println(me.productExceptSelf(nums)[i]);
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(me.productExceptSelf2(nums)[i]);
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(me.productExceptSelf3(nums)[i]);
		}
	}

}
