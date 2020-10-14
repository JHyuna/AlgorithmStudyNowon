package silver5;

import java.util.Scanner;

//6은 9로 9는 6으로 뒤집어 사용 가능
public class 방번호 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0, ans = 0;
		
		int[] arr = new int[9];
		for(int i=0;i<str.length();i++) {
			//홀수개인 경우
			if(str.charAt(i)-'0' == 6) {
				count++;
			}else if(str.charAt(i)-'0' == 9) {
				count++;
			}else {
				arr[str.charAt(i)-'0']++;
			}
		}
		
		//count가 짝수일 경우 나누기2만큼 arr[6]에 넣어줌
		if(count%2 == 0)
			arr[6] = count/2;
		else {
			arr[6] = count/2+1;
		}
		
		for(int i=0;i<arr.length;i++) {
			ans = Math.max(ans,arr[i]);
		}
		System.out.println(ans);
	}
		
}
