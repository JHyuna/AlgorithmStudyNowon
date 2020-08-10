package week1;

import java.util.Arrays;

public class 평균구하기 {
	
	public double solution(int[] arr) {
		double answer = 0;
		double sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		answer = sum/arr.length;
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		평균구하기 pung = new 평균구하기();
		System.out.print(pung.solution(arr));
	}

}
