import java.util.Scanner;

public class TEST_1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
//        sc.next();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            String tmp = sc.next();
            String[] tmpString = tmp.split("");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(tmpString[j]);
            }
        }
        int width = 1;
        for(int i = 1; i <= (n < m ? n : m); i++) { // 이
            for (int j = 0; j < n - i; j++) {
                for (int k = 0; k < m - i; k++) {
                    if (matrix[j][k] == matrix[j+i][k] && matrix[j][k] == matrix[j][k+i] && matrix[j][k] == matrix[j+i][k+i]) {
                        width = i+1;
                    }
                }
            }
        }
        System.out.println(width*width);


    }
}
