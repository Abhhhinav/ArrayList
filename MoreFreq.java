package ArrayList;

public class MoreFreq {
    public  static  int mostFrequent(int[] nums, int key) {
        int freq[] = new int[1001];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == key){
               freq[nums[i]]++;
            }
        }
        int max =0;
        for(int i=1;i<freq.length;i++){
            if(freq[i]>freq[max]){
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,3}; 
        System.out.println(mostFrequent(nums,2));
    }
}
