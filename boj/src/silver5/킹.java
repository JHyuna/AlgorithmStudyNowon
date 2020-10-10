package silver5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 킹{
	
	private static class Coordinate {
		int x;
		int y;
		
		public Coordinate(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static Map<String, Coordinate> map = new HashMap<String,Coordinate>() {{
		put("R",new Coordinate(0,1));
		put("L",new Coordinate(0,-1));
		put("B",new Coordinate(-1,0));
		put("T",new Coordinate(1,0));
		put("RT",new Coordinate(1,1));
		put("LT",new Coordinate(1,-1));
		put("RB",new Coordinate(-1,1));
		put("LB",new Coordinate(-1,-1));
	}};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int[] king = {a.charAt(1)-'0', a.charAt(0)-'A'};
		
		String b  = sc.next();
		int[] stone = {b.charAt(1)-'0', b.charAt(0)-'A'};
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			String move = sc.next();
			if(king[0]+map.get(move).x <= 0 || king[0]+map.get(move).x >= 9 ||
					king[1]+map.get(move).y < 0 || king[1]+map.get(move).y >= 8) {
				continue;
			//범위엔 있는데 움직임이 돌쪽인 경우
			}else if(king[0]+map.get(move).x == stone[0] && king[1]+map.get(move).y == stone[1]) {
				if(stone[0]+map.get(move).x <= 0 || stone[0]+map.get(move).x >= 9 || 
						stone[1]+map.get(move).y < 0 || stone[1]+map.get(move).y >= 8) {
					continue;
				}else {
					  stone[0] = stone[0] + map.get(move).x;
	                  stone[1] = stone[1] + map.get(move).y;
	                  king[0] = king[0] + map.get(move).x;
	                  king[1] = king[1] + map.get(move).y;
				}
			//돌쪽이 아닌 경우
			}else {
				 king[0] = (int)king[0] + (int)map.get(move).x;
	             king[1] = (int)king[1] + (int)map.get(move).y;
			}
		}
		System.out.println((char)(king[1]+'A')+""+(char)(king[0]+'0'));
	    System.out.println((char)(stone[1]+'A')+""+(char)(stone[0]+'0'));
	}
}
