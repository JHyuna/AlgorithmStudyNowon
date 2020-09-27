package leetcode;


public class 섬의개수 {
	// (-1,0),(1,0),(0,1),(0,-1) 이렇게 비교하기 위해
	static int[] com = {-1,1,0,0};
	static int[] com2 = {0,0,1,-1};
	public static int numIslands(char[][] grid) {
		int ans = 0;
		for(int i=0;i<grid.length;i++) {
			//세로의 길이
            int ver = grid.length;
			for(int j=0;j<grid[i].length;j++) {
				//가로의 길이
                int hori = grid[i].length;
				if(grid[i][j] == '1') {
					dfs(grid,i,j,ver,hori);
					ans+=1;
				}
			}
		}
		return ans;
	}
	
	
	private static void dfs(char[][] grid, int i, int j,int ver,int hori) {
		if(grid[i][j] != '1')
			return;
		//1이였는데 이미 검사했으면 0으로 바꿔줌
		grid[i][j] = '0';
		
		for(int k=0;k<4;k++) {
			//0보다 크거나 같고 각각의 길이보단 작은지 확인
			if(i+com[k] >= 0 && i+com[k] < ver && j+com2[k] >=0 && j+com2[k] < hori)
				dfs(grid,i+com[k],j+com2[k],ver,hori);
		}
			
	}
	
	public static void main(String args[]) {
		char[][] grid = {{'1','1','1','1','0'},
						{'1','1','0','1','0'},
						{'1','1','0','0','0'},
						{'0','0','0','0','0'}};
		System.out.println(섬의개수.numIslands(grid));
	}

}
