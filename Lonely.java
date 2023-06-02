package ArrayList;
import java.util.*;
public class Lonely {
        public static List<Integer> findLonely(int[] nums) {
            List<Integer>Result = new ArrayList<>();
            HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
    
            for (int i = 0; i < nums.length; i++) {
                if (hm.containsKey(nums[i])) {
                    hm.put(nums[i], hm.get(nums[i]) + 1);
                } else {
                    hm.put(nums[i], 1);
                }
            }
    
            for (int i = 0; i < nums.length; i++) {
                if (hm.get(nums[i]) == 1 && !hm.containsKey(nums[i] + 1) && !hm.containsKey(nums[i] - 1)) {
                    Result.add(nums[i]);
                }
            }
            return Result;
        }
    public static void main(String args[]){
       int nums[] = {1,3,5,3};
       System.out.println(findLonely(nums));
    }
}
