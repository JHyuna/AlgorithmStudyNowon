package kakao.Yearang.test;

//	자연수 뒤집어 배열로 만들기
//	문제 설명
//	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//	
//	제한 조건
//	n은 10,000,000,000이하인 자연수입니다.
//	입출력 예
//	n	return
//	12345	[5,4,3,2,1]

public class TEST_12932 {

	public static void main(String[] args) {

	}
	
	
    public static int[] solution(long n) {
        
        String nString= Long.toString(n);
        StringBuffer nStringBuffer = new StringBuffer(nString);
        int[] answer = new int[nStringBuffer.length()];
        int i = 0;
        for(String tmp : nStringBuffer.reverse().toString().split("")) {
        	 answer[i]= Integer.parseInt(tmp);
        	 i++;
        }
        return answer;
    }
	
	

}
