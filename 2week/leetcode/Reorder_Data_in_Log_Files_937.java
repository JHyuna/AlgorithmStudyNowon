package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class Reorder_Data_in_Log_Files_937 {

	public static void main(String[] args) {
		String[] l = { "a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo", "a2 act car" };
		reorderLogFiles(l);
	}

	public static String[] reorderLogFiles(String[] logs) {

		ArrayList<HashMap<String, String[]>> letAl = new ArrayList<>();
		ArrayList<String> digLog = new ArrayList<>();
		for (String log : logs) {
			String[] tmp = log.split(" ");
			if (isNumber(tmp[1])) { // 숫자로그는 원래 순서대로
				digLog.add(log);
			} else {
				HashMap<String, String[]> tmph = new HashMap<String, String[]>();
				tmph.put(log, tmp);
				letAl.add(tmph); // 문자로그는 띄어쓰기로 구분해서 저장
			}
		}

		// 정렬
		letAl.sort(new Comparator<HashMap<String, String[]>>() {

			@Override
			public int compare(HashMap<String, String[]> o1, HashMap<String, String[]> o2) {
				String[] tmpo1 = null, tmpo2 = null;
				// 구분자 제외하고 정렬
				for (String[] key : o1.values()) {
					tmpo1 = Arrays.copyOfRange(key, 1, key.length);

				}
				for (String[] key : o2.values()) {
					tmpo2 = Arrays.copyOfRange(key, 1, key.length);
				}

				int answer = Arrays.toString(tmpo1).compareTo(Arrays.toString(tmpo2));
				if (answer == 0) { // 구분자 제외하고 비교했는데 같을 때 -> 구분자 비교
					String k1 = "", k2 = "";
					for (String key : o1.keySet()) {
						k1 = key;
					}
					for (String key : o2.keySet()) {
						k2 = key;
					}
					answer = k1.compareTo(k2);
				}

				return answer;
			}
		});

		String[] answer = new String[logs.length];
		int i = 0;
		for (i = 0; i < letAl.size(); i++) {
			Iterator<String> keys = letAl.get(i).keySet().iterator();
			if (keys.hasNext()) {
				answer[i] = keys.next();
			}
		}

		for (String dig : digLog) {
			answer[i] = dig;
			i++;
		}

		return answer;
	}

	public static boolean isNumber(String str) {
		boolean result = false;

		try {
			Double.parseDouble(str);
			result = true;
		} catch (Exception e) {
		}

		return result;
	}

}
