package solved;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class 킹 {
	static Map<String,List<Integer>> map = new HashMap<String,List<Integer>>() {{
		put("R",Arrays.asList(0,1));
		put("L",Arrays.asList(0,-1));
		put("B",Arrays.asList(-1,0));
		put("T",Arrays.asList(1,0));
		put("RT",Arrays.asList(1,1));
		put("LT",Arrays.asList(1,-1));
		put("RB",Arrays.asList(-1,1));
		put("LB",Arrays.asList(-1,-1));
	}};

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[][] cur = new int[8][8];
		//킹의 위치
		String a = sc.next();
		int[] king = {a.charAt(1)-'0'-1, a.charAt(0)-'A'};  //0,0
		System.out.println(king[0]+","+king[1]);
		
		//돌의 위치
		String b = sc.next();
		int[] stone = {b.charAt(1)-'0'-1, b.charAt(0)-'A'}; //0,1
		System.out.println(stone[0]+","+stone[1]);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			String move = sc.next();
			if(king[0]+map.get(move).get(0) < 0 || king[0]+map.get(move).get(0) > 6 || 
					king[1]+map.get(move).get(1) < 0 || king[1]+map.get(move).get(1) > 6) { 
				continue;
			}
			else if(stone[0]+map.get(move).get(0) < 0 || stone[0]+map.get(move).get(0) > 6 || 
						stone[1]+map.get(move).get(1) < 0 || stone[1]+map.get(move).get(1) > 6) {
				continue;
			}else {
				if(king[0]+map.get(move).get(0) == stone[0] && king[1]+map.get(move).get(1) == stone[1]) {
					stone[0] = stone[0] + map.get(move).get(0);
					stone[1] = stone[1] + map.get(move).get(1);
				}
				king[0] = (int)king[0] + (int)map.get(move).get(0);
				king[1] = (int)king[1] + (int)map.get(move).get(1);
				
			}
		}
		System.out.println((char)(king[1]+'A')+""+(char)(king[0]+'0'+1));
		System.out.println((char)(stone[1]+'A')+""+(char)(stone[0]+'0'+1));
	}
}
