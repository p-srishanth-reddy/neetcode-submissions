class Solution {
    public int binary(int[] nums,int target,int low,int high){
        int mid=low+(high-low)/2;
        if(low>high)
        return -1;
        if(nums[mid]==target){
            return mid;
        }
     if (target < nums[mid]) {
            return binary(nums, target, low, mid - 1);
        }
        return binary(nums, target, mid + 1, high);
    
    }
    public int search(int[] nums, int target) {
        return binary(nums,target,0,nums.length-1);
    }
}
