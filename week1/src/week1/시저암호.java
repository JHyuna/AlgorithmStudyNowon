package week1;

public class 시저암호 {
	
	public String solution(String s, int n) {
		
		String answer ="";
        char[] ans = new char[s.length()];
        int a = (int)'a';
        int z = (int)'z';
        int A = (int)'A';
        int Z = (int)'Z';
        char[] ch = s.toCharArray();
        
        for(int i=0;i<ch.length;i++) {
        	System.out.print(i);
        	int q = (int)ch[i];
        	if(q  >= a && q  <=z) {
        		if(q+n <= z) {
        			ans[i] = (char)(q+n);
        		}else if(q+n > z) {
        			ans[i] = (char)(q+n-(z-a)-1);
        		}
        	}
        	else if(q  >= A && q  <=Z) {
        		if(q+n <= Z) {
        			ans[i] = (char)(q+n);
        		}else if(q+n > Z) {
        			ans[i] = (char)(q+n-(z-a)-1);
        		}
        	}
        	else {
        		ans[i] = (char)q;
        	}
        }
        
        answer= new String(ans);
        return answer;
	}       
	
}
