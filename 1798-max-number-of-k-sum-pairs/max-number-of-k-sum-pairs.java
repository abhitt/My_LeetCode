class Solution {
    public int maxOperations(int[] nums, int k) {
        int opr = 0; 
        int i =0 ;
        int j= nums.length-1;
        Arrays.sort(nums);
        while(i<j){
            if(nums[i]+nums[j]==k){
                opr++;
                i++;
                j--;

            }else if(nums[i]+nums[j]>k){
                j--;
            }else{
                i++;
            }
        }
        return opr;
    }
}