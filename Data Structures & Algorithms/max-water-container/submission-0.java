class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
      int  max=0;
        while(left<right){
            int s=(heights[left]<heights[right])?heights[left]:heights[right];
            s*=(right-left);
            if(s>max){
                max=s;
            }
            else if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
