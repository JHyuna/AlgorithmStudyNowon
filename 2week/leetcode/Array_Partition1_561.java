import java.util.Arrays;

public class Array_Partition1_561 {
    public static void main(String[] args) {

    }

    public static int arrayPairSum(int[] nums) {

        int answer = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i += 2) {
            answer += nums[i];
        }


        return answer;
    }
}
