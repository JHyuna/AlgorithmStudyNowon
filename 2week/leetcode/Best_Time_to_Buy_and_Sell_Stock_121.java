<<<<<<< HEAD
package week2;

public class Best_Time_to_Buy_and_Sell_Stock_121 {

	public static void main(String[] args) {
		int[] test = {2,1,2,1,0,1,2};
		maxProfit(test);
	}

	public static int maxProfit(int[] prices) {
		int max = -1;
		int min = -1;
		int answer = 0;
		for (int price : prices) {
			if(max < price && min != -1) {
				max = price;
			}
			if(min == -1 || min > price) {
				if(answer < max - min) {
					answer = max - min;
				}
				min = price;
				max = -1;
			}
		}
		
		if(answer < max - min) {
			answer = max - min;
		}

		return answer;
	}
=======
public class Best_Time_to_Buy_and_Sell_Stock_121 {
    public static void main(String[] args) {

    }

    public static int maxProfit(int[] prices) {
        int max = -1;
        int min = -1;
        int answer = 0;
        for (int price : prices) {
            if (max < price && min != -1) {
                max = price;
            }
            if (min == -1 || min > price) {
                if (answer < max - min) {
                    answer = max - min;
                }
                min = price;
                max = -1;
            }
        }

        if (answer < max - min) {
            answer = max - min;
        }

        return answer;
    }
>>>>>>> 0183284b7f31c968ebf7904dc5bcf311185ab553
}
