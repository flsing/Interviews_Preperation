


class Solution {
    public static int solution(String A, String B) {

    	if (A.contains(B)){
    		return 1;
    	}
    	else{
    		String nA = A;
    		for (int i = 2; i < B.length(); i++){
    			
    			nA = nA.concat(A);
    			if(nA.contains(B)){
    				return i;
    			}
    		}
    	
    	}
    	return -1;	
      
    }
    public static void main(String[] args){
    	solution("abcd", "cdabcdab");
    	solution("d", "b");
    	solution("derer", "hgf");
    	solution("b", "b");
    }
}

