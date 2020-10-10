import java.util.*;

public class TEST_1713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int vote = sc.nextInt();
        int[] voteArr = new int[vote];
        for(int i = 0; i < vote; i++) {
            voteArr[i] = sc.nextInt();
        }
        Map<Integer, Integer> hm = new LinkedHashMap<>(); // 순서가 보장되는 해시맵
        for(int i = 0; i < vote; i++) {
            if(i < n) { // 처음 n 개만큼은 그냥 넣어줌
                if(hm.containsKey(voteArr[i])){
                    hm.put(voteArr[i], hm.get(voteArr[i])+1);
                    n++;
                } else {
                    hm.put(voteArr[i], 1);
                }
            } else {
                if(hm.containsKey(voteArr[i])) {    // 이미 게시되어 있는 경
                    hm.put(voteArr[i], hm.get(voteArr[i])+1);
                } else {
                    int min = vote +1;
                    int minKey = 0;
                    for(int key : hm.keySet()) {    // 최소값 찾기
                        if(hm.get(key) < min) {
                            min = hm.get(key);
                            minKey = key;
                        }
                    }
                    hm.remove(minKey);
                    hm.put(voteArr[i], 1);

                }
            }
        }
        List<Integer> answer = new ArrayList<>(hm.keySet());
        Collections.sort(answer);
        for(int answerT : answer) {
            System.out.print(answerT + " ");
        }

    }
}
