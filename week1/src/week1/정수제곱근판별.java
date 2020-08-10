package week1;

public class 정수제곱근판별 {
	public long solution(long n) {
        long answer = 0;
        long ans = 0;
        if((long)Math.sqrt(n) * (long)Math.sqrt(n) == n) {
        	ans = (long)Math.sqrt(n) + 1;
        	answer = ans*ans;
        }else {
        	answer = -1;
        }
        return answer;
    }
	public static void main(String[] args) {
		long n = 7;
		정수제곱근판별 jung = new 정수제곱근판별();
		System.out.print(jung.solution(n));
	}

}
