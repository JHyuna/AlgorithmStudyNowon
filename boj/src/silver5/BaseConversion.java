package silver5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//파라미터에 넣어주는 것으로 문자열 구분
StringTokenizer st = new StringTokenizer(br.readLine(), " ");
int A = Integer.parseInt(st.nextToken());
int B = Integer.parseInt(st.nextToken());*/

public class BaseConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int count = sc.nextInt();
		int[] arr = new int[count];
		for(int i=0;i<count;i++) {
			arr[i] = sc.nextInt();
		}
		
		int mul = 1, total = 0;
		for(int i=count-1;i>=0;i--) {
			total += arr[i] * mul;
			mul *= A;
		}
		
		int around = 0;
		while(total >= B) {
			around = total%B;
			list.add(0, around);
			total /= B;
		}
		list.add(0,total);
	
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
	}
	
}
