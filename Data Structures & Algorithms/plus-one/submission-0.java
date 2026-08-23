class Solution {
    public int[] plusOne(int[] digits) {
        int n[]=new int[digits.length+1];
        int c=1;
        for(int i=digits.length;i>=1;i--){
            n[i]=(digits[i-1]+c)%10;
            c=(digits[i-1]+c)/10;
        }
        if(c==0){
            int n1[]=new int[digits.length];
            for(int i=0;i<digits.length;i++)
            n1[i]=n[i+1];
            return n1;
        }
        else{
            n[0]=1;
        }
        return n;
    }
}
