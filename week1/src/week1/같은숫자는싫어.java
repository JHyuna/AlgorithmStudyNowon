package week1;

public class 같은숫자는싫어 {
	
	public int[] solution(int []arr) {
		
		int[] answer = new int[arr.length];
		int[] ans;
		answer[0] = arr[0];
		int other = answer[0];
		int j =1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] != other) {
				answer[j] = arr[i];
				other = arr[i];
				j++;
			}
		}
		
		ans = new int[j];
		for(int i=0;i<j;i++) {
			ans[i] = answer[i];
		}
		
		return ans;
	}
	
}
