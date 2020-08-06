package kakao.Yearang.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class TEST_12901 {
	public static void main(String[] args) {
		solution(5, 24);
	}

	public static String solution(int a, int b) {
		String answer = "";

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-d");
		Date nDate = null;
		try {
			nDate = dateFormat.parse("2016-" + a + "-" + b);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(nDate);

		int dayNum = cal.get(Calendar.DAY_OF_WEEK);

		switch (dayNum) {
		case 1:
			answer = "SUN";
			break;
		case 2:
			answer = "MON";
			break;
		case 3:
			answer = "TUE";
			break;
		case 4:
			answer = "WED";
			break;
		case 5:
			answer = "THU";
			break;
		case 6:
			answer = "FRI";
			break;
		case 7:
			answer = "SAT";
			break;

		}
		
		return answer;
	}
}