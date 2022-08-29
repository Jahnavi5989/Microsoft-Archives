Question: if Given target present in the array then return true or else false




Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
       int l=0;
        int r=n-1;
        if(nums[l]+nums[r]==target){
            return true;
        }
        else if(nums[i]+nums[r]>target){
            r--;
        }
        else{
            l++;
        }
        
        return false;
    }
}
