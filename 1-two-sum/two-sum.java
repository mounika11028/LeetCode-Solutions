class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        for(int L=0;L<nums.length;L++){
            for(int R=L+1;R<nums.length;R++){
                if(nums[L]+nums[R]==target){
                    ans[0]=L;
                    ans[1]=R;
                }
            }
        }
        return ans;
        
    }
}