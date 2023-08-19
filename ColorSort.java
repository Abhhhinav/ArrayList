public class ColorSort{
    
        public void sortColors(int[] nums) {
            int a =0,b=0,c = nums.length-1;
            while(b<=c){
                if(nums[b]==0)
                    swap(nums,a++,b++);
                else if(nums[b]==2)
                    swap(nums,b,c--);
                else
                    b++;
            }
        }
    
        private void swap(int nums[], int p1, int p2){
            int temp=nums[p1];
            nums[p1] = nums[p2];
            nums[p2] = temp;
        }
    
    public void main(String args[]) {
        int nums[] = {0,2,1,1,2,1,1,1,0,0,0};
        sortColors(nums);

    }
}