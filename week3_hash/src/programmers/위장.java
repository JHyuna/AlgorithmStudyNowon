package programmers;

import java.util.HashMap;
import java.util.Map;

public class 위장 {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<clothes.length;i++) {
        	if(map.containsKey(clothes[i][1])) {
        		map.put(clothes[i][1], map.get(clothes[i][1])+1);
        	}else {
        		map.put(clothes[i][1], 1);
        	}
        }
        for(String key : map.keySet()) {
        	answer *= (map.get(key)+1);
        }
        answer -= 1;
        return answer;
    }

	public static void main(String[] args) {
		String[][] clothes = 
			{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"yellow_hat", "headgear"},
					{"blue_sunglasses","eyewear"}};
		위장 we = new 위장();
		System.out.print(we.solution(clothes));
	}

}
