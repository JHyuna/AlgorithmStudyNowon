package silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 자리배정 {
	private static int[] arx = {1, 0, -1, 0};
	private static int[] ary = {0, 1, 0, -1};

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		//공연장의 크기 - 가로,세로
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		int myloc = Integer.parseInt(br.readLine());
		
		if(myloc > x*y) {
			System.out.println(0);
		}else {
		//6 ,5가 넘어김
			System.out.println(moveToMyLoc(x,y,myloc-1,sb));
		}
	}
	
	private static StringBuilder moveToMyLoc(int x, int y, int myloc, StringBuilder sb) {
		int cur_x = 0;
		int cur_y = 0;
		int k = 0, count = 0;
		int x2 = x-1, y2 =y-1;
		
		while(x2 >= 0 && y2 >= 0) {
			
			if(myloc >= x2) {
				myloc -= x2;
				cur_x += arx[k] * x2;
				cur_y += ary[k] * x2;
				k++;
				//System.out.println(cur_x + " " +cur_y);
			}else {
				cur_x += arx[k] * (myloc);
				cur_y += ary[k] * (myloc);
				break;
			}
			
			if(count > 0) {
				x2--;
			}
			
			if(myloc >= y2) {
				myloc -= y2;
				cur_x += arx[k] * y2;
				cur_y += ary[k] * y2;
				k++;
				//System.out.println(cur_x + " " +cur_y);
			}else {
				cur_x += arx[k] * (myloc);
				cur_y += ary[k] * (myloc);
				break;
			}
			
			if(k == 4) {
				k = 0;
			}
			count++;
			y2--;
		}
		
		sb.append((cur_y+1)+" "+(cur_x+1));
		return sb;
	}
}

	
