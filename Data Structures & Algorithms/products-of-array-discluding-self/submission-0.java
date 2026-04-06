class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);

        int l = 0;
        int r = nums.length - 1;
        int m = 1;
        while (l < nums.length){
            ans[l] *= m;
            m *= nums[l];
            l++;
        }
        int x = 1;
        while (r >= 0){
            ans[r] *= x;
            x *= nums[r];
            r--;
        }
        return ans;
    }
}  
