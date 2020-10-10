import java.util.*;

// 반례 : AABC
public class TEST_1213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        String answer = "";

        String[] nameArr = name.split("");
        Map<String, Integer> hm = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (String tmp : nameArr) {
            if (set.contains(tmp)) {
                hm.put(tmp, hm.get(tmp) + 1);
            } else {
                hm.put(tmp, 1);
                set.add(tmp);
            }
        }
        int odd = 0;

        List<String> keySetList = new ArrayList<>(hm.keySet());
        String middle = "";     // 가운데글
        int remove = -1;
        for (int i = 0; i < keySetList.size(); i++) {
            if (hm.get(keySetList.get(i)) % 2 != 0) {
                odd += 1;
                middle = keySetList.get(i);
                if (hm.get(keySetList.get(i)) == 1) {
                    remove = i;
                } else {
                    hm.put(keySetList.get(i), hm.get(keySetList.get(i))-1);
                }

                if (odd >= 2) {
                    System.out.print("I'm Sorry Hansoo");
                    return;
                }
            }
        }

        if( remove != -1) {
            keySetList.remove(remove);
        }
        // 알파벳 순서로 정
        Collections.sort(keySetList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return o1.compareTo(o2);
            }
        });

        // 정렬한 순서대로 정답에 붙여줌
        for (int i = 0; i < keySetList.size(); i++) {
            for(int j = 0; j < hm.get(keySetList.get(i))/2; j++) {
                answer += keySetList.get(i);
            }
        }
        answer += middle;   // 가운데 글자 붙여주기
        for (int i = keySetList.size() - 1; i >= 0; i--) {
            for(int j = 0; j < hm.get(keySetList.get(i))/2; j++) {
                answer += keySetList.get(i);
            }
        }

        System.out.print(answer);

    }
}
