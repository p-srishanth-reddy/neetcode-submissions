class Solution {
    public int hammingWeight(int n) {
        int x=0;
        while(n>0){
            if((n&1)==1){
                x+=1;
            }
            n = n >>> 1;
        }
        return x;
    }
}
