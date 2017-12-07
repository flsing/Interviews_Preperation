import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NotDuplicate {

	
	public int solution(int[] nums) {
        
		int result = 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int num: nums) {
           if (set.contains(num)) {
               set.remove(num);
           }else{
               set.add(num);
           }
        }
       
        for(Integer elem: set) {
            result = elem;
        }
         return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
