class Solution {
    public boolean isPalindrome(String s) {
        String s2=s.toLowerCase();
       int c=0;
       String s1 = s2.replaceAll("[^a-z0-9]", "");
       for(int i=0;i<s1.length()/2;i++){
            if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)){
                c=1;
                break;
            }
       }
       if(c==0)
        return true;
         return false;

    }
}
