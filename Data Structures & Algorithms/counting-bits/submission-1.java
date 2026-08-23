class Solution {
    public int count(int n){
        int c=0;
        while(n>0){
            if(n%2!=0)
             c++;
             n=n/2;
        }
        return c;
    }
    public int[] countBits(int n) {
        int n1[]=new int[n+1];
        for(int i=0;i<=n;i++){
            n1[i]=count(i);
        }
        return n1;
    }
}
