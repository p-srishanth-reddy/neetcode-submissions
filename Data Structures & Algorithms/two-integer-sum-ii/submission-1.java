class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum[]=new int[2];
        int right=numbers.length-1;
       int left=0;
       while(left<right){
        int s=numbers[left]+numbers[right];
        if(s==target){
            sum[0]=left+1;
            sum[1]=right+1;
            break;
        }
        else if(s>target){
            right--;
        }
        else{
            left++;
        }
       }
        return sum;
    }
}
