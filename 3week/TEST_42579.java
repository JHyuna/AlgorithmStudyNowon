import java.util.*;

public class TEST_42579 {
    public static void main(String[] args) {

    }

    public static int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> countMap = new HashMap<String, Integer>();
        HashMap<String, HashMap<Integer, Integer>> genreMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            if (countMap.get(genres[i]) == null) {
                countMap.put(genres[i], plays[i]);
                genreMap.put(genres[i], new HashMap<Integer, Integer>());
            } else {
                countMap.put(genres[i], countMap.get(genres[i]) + plays[i]);
            }

            genreMap.get(genres[i]).put(i, plays[i]);
        }

        List<String> keySetList = new ArrayList<>(countMap.keySet());

        // 속한 노래가 많이 재생된 장르 정렬
        Collections.sort(keySetList, (o1, o2) -> (-countMap.get(o1).compareTo(countMap.get(o2))));

        ArrayList<Integer> tmpAnswer = new ArrayList<Integer>();
        int i = 0;
        // 두개씩 모아 출력
        for(String k : keySetList) {
            List<Integer> tempList = new ArrayList<>(genreMap.get(k).keySet());
            if(genreMap.get(k).size() == 1) {   // 장르에 곡이 하나일 때
                tmpAnswer.add(tempList.get(0));
                continue;
            }

            Collections.sort(tempList, new Comparator<Integer>() {

                @Override
                public int compare(Integer o1, Integer o2) {
                    int a = genreMap.get(k).get(o1);
                    int b = genreMap.get(k).get(o2);
                    if(a==b) {
                        return (o1-o2);
                    }
                    return -(a - b);
                }

            });
            tmpAnswer.add(tempList.get(0));
            tmpAnswer.add(tempList.get(1));
        }

        int [] answer = new int[tmpAnswer.size()];
        for (int j = 0; j < answer.length; j++) {
            answer[j] = tmpAnswer.get(j);

        }



        return answer;
    }
}
