package silver5;

import java.util.Scanner;
import java.util.Stack;
public class 그룹단어체커 {
	//한번나온 단어는 연속해서 바로 나오거나 안나와야해
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0,count =0;
		Stack<Character> st = null;
		for(int k=0;k<n;k++) {
			String str = sc.next();
			st = new Stack<>();
			for(char ch : str.toCharArray()) {
				if(!st.isEmpty() && st.peek() == ch){
					st.pop();
				}
				st.add(ch);
			}
			//System.out.println(st);
			for(int i=0;i<st.size()-1;i++) {
				for(int j=i+1;j<st.size();j++) {
					if(st.elementAt(i) == st.elementAt(j)) {
						count += 1;
					}
				}
			}
			//System.out.println("count: "+count);
			if(count == 0)
				ans += 1;
			count = 0;
		}
		System.out.println(ans);
	}
}
