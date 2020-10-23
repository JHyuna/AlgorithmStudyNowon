package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 비슷한단어 {
	// 한 단어에서 한 문자를 더하거나, 빼거나, 하나의 문자를 다른 문자로 바꾸어 같은 문자가 되면 비슷한 단어
	public static void main(String args[]) throws Exception, IOException {
		BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0;
		int N = Integer.parseInt(sb.readLine());
		
		char[] com = sb.readLine().toCharArray();
		int[] count = new int[26];
		
		
		//count['D'-'A']
		for(int i = 0; i < com.length; i++) {
			count[com[i]-'A']++;
		}		
		
		for(int i = 0; i < N-1; i++) {
			char[] other = sb.readLine().toCharArray();
			
			int[] otherCount = count.clone();
			
			int chance = 0;
			
			for(int k = 0; k < other.length; k++) {
				if(otherCount[other[k]-'A'] > 0) {
					chance++;
					otherCount[other[k]-'A']--;
				}
			}
		
			//글자 수 동일한 경우
			if(com.length == other.length) {
				if(chance == com.length || chance == com.length-1) {
					ans += 1;
				}
			//글자 수 하나 더 큰 경우
			}else if(com.length+1 == other.length) {
				if(chance == com.length) {
					ans += 1;
				}
			//글자수 하나 적은 경우
			}else if(com.length == other.length+1) {
				if(chance == other.length) {
					ans += 1;
				}
			}
		}
		System.out.println(ans);
	}
}
