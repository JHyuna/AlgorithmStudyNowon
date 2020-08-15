package 배열;

public class 주식을사고팔기가장좋은시점 {
	
	//o(n^2) 내풀이
	public int maxProfit(int[] prices) {
		int max = 0;
		for(int i=prices.length-1;i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				if(max < prices[i]-prices[j]) {
					max = prices[i]-prices[j];
				}
			}
		}
		return max;
	}
	
	// o(n)
	public int maxProfit2(int[] prices) {
		int minprice = Integer.MAX_VALUE;   //2147483647
		int maxprofit =0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i] < minprice) {
				minprice = prices[i];
			}
			else if(prices[i] - minprice > maxprofit)
				maxprofit = prices[i] - minprice;
		}
		return maxprofit;
		
	}
	
	public static void main(String[] args) {
		int[] prices = {2,4,1};
		주식을사고팔기가장좋은시점 joo = new 주식을사고팔기가장좋은시점();
		System.out.print(joo.maxProfit2(prices));
	}

}
