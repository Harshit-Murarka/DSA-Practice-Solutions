class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] a=new int[2];
        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums.length;j++){
                if(nums[i]+nums[j]== target && i!=j){
                    a[0]=i;
                    a[1]=j;   
                    break;                
                }
            }
        }
     return a;}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna