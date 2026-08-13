class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == 1) c++;
            else{
                if(max<c) max=c;
                c=0;
            }
            if(i==n-1 && c>max) max=c;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna