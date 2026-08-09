class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        int j =1;
        try{
            while(true){
                if(nums[i]==nums[j]) j++;
                else{
                    nums[++i]=nums[j++];
                }
            }
        }catch(Exception e){
            return ++i;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna