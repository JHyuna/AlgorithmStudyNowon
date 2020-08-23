import java.util.ArrayList;
import java.util.HashMap;

public class TEST_42578 {
    public static void main(String[] args) {

    }
    static int result = 0;

    public static int solution(String[][] clothes) {

        HashMap<String, ArrayList<String>> test = new HashMap<String, ArrayList<String>>();

        for (int i = 0; i < clothes.length; i++) {
            if (test.get(clothes[i][1]) == null) {
                test.put(clothes[i][1], new ArrayList<String>());
            }
            test.get(clothes[i][1]).add(clothes[i][0]);

        }

        ArrayList<String[]> al = new ArrayList<String[]>();

        for (String k : test.keySet()) {
            test.get(k).add("empty");   // 선택하지 않는 경
            al.add((test.get(k)).toArray(new String[test.get(k).size()]));
        }

        for(int i = 0; i < al.get(0).length; i++) {
            dfs(al, 0, i);
        }

        return result-1;    // 아무것도 선택하지 않는 경우 제외

    }



    public static void dfs(ArrayList<String[]> al, int i, int j) {

        if(i==al.size()-1) {
            result++;
        }
        if(i+1 < al.size()) {

            for (int j2 = 0; j2 < al.get(i+1).length; j2++) {
                dfs(al, i+1, j2);

            }
        }

    }
}
