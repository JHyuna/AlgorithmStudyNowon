import java.util.HashMap;
import java.util.Scanner;

public class TEST_1063 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String king = s.next();
        String dol = s.next();
        int n = s.nextInt();

        int[][] matrix = new int[8][8];

        int[] kingInt = new int[2];
        int[] dolInt = new int[2];

        kingInt[0] = king.toCharArray()[0];
        kingInt[1] = Integer.parseInt(king.split("")[1]);

        dolInt[0] = dol.toCharArray()[0];
        dolInt[1] = Integer.parseInt(dol.split("")[1]);


        for (int i = 0; i < n; i++) {

            String move = s.next();

            int col = 0, row = 0;

            switch (move) {
                case "R":
                    col = 1;
                    break;
                case "L":
                    col = -1;
                    break;
                case "B":
                    row = -1;
                    break;
                case "T":
                    row = 1;
                    break;
                case "RT":
                    col = 1;
                    row = 1;
                    break;
                case "LT":
                    col = -1;
                    row = 1;
                    break;
                case "RB":
                    col = 1;
                    row = -1;
                    break;
                case "LB":
                    col = -1;
                    row = -1;
                    break;
            }

            if (kingInt[0] + col >= 65 && kingInt[0] + col <= 72 && kingInt[1] + row >= 1 && kingInt[1] + row <= 8) {
                if (dolInt[0] == kingInt[0] + col && dolInt[1] == kingInt[1] + row) { // 돌이랑 겹치면
                    if (dolInt[0] + col >= 65 && dolInt[0] + col <= 72 && dolInt[1] + row >= 1 && dolInt[1] + row <= 8) {
                        kingInt[1] += row;
                        kingInt[0] += col;
                        dolInt[0] += col;
                        dolInt[1] += row;
                    }
                } else { // 안겹치면
                    kingInt[1] += row;
                    kingInt[0] += col;
                }
            }
        }

        System.out.println(Character.toString((char)kingInt[0]) + kingInt[1]);
        System.out.println(Character.toString((char)dolInt[0]) + dolInt[1]);

    }

}
