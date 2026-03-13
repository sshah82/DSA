class Solution {
    public int[] sortedSquares(int[] nums) {
        int x = 0; int y = nums.length -1;
        int[] ans = new int[nums.length];
        for (int i=nums.length-1; i>=0; i--){
            if (Math.abs(nums[x])<Math.abs(nums[y])){
                ans[i] = nums[y] * nums[y];
                y--;
                }else{
                    ans[i] = nums[x] * nums[x];
                    x++;
                }
                
            }
            return ans;
            
    } 
            
            
    
}