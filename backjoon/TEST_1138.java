import java.util.Scanner;

public class TEST_1138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line = new int[n];
        for (int i = 0; i < n; i++) {
            line[i] = sc.nextInt();
        }
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            if (line[i] == 0) { // 키큰사람이 왼쪽에 없으면
                for (int j = 0; j < n; j++) {    // 걍 제일 가까운 자리
                    if (answer[j] == 0) {
                        answer[j] = i + 1;
                        break;
                    }
                }
            } else {
                int tmp = 0;    // 키큰사람 수
                for (int j = 0; j < n; j++) {
                    if (answer[j] == 0) {    // 자리에 아무도 없으면 본인보다 키큰 사람이 들어갈 자리임
                        tmp++;  // 키큰사람 ++
                        if (tmp == line[i]) {    // 키큰사람의 수랑 빈 자리의 수가 같으면
                            while (j <= n) {
                                if (answer[j + 1] == 0) {
                                    answer[j + 1] = i + 1;    // 거기가 내자리
                                    break;
                                }
                                j++;
                            }
                            break;
                        }
                    }
                }
            }
        }

        for (int tmp : answer) {
            System.out.print(tmp + " ");
        }

    }
}
