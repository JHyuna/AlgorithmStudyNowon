package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 힙 이용 방법도 존재!!
public class 상위k빈도요소 {
    public int[] topKFrequent(int[] nums, int k) {
    	int[] answer = new int[k];
    	int max = 0, i=0, realKey=0;
    	Map<Integer,Integer> map = new HashMap<>();
    	for(int num : nums) {
    		if(map.containsKey(num)) {
    			map.put(num, map.get(num)+1);
    		}else
    			map.put(num, 1);
    	}
    	while(i < k) {
    		for(int keys : map.keySet()) {
        		if(max < map.get(keys)) {
        			realKey = keys;
        			max = map.get(keys);
        		}
        	}
    		max = 0;
    		answer[i] = realKey;
    		map.put(realKey, 0);
    		i++;
    	}
    	return answer;
    }
	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		int k = 2;
		상위k빈도요소 upk = new 상위k빈도요소();
		int[] ans = upk.topKFrequent(nums, k);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
