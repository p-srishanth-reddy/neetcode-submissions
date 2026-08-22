class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new ArrayList();
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> l=new ArrayList();
        int top=0,bottom=m-1,left=0,right=n-1;
        while(top<=bottom && left<=right){
            int i=left;
            while(i<=right){
                l.add(matrix[top][i]);
                i++;
            }
            top++;
            i=top;
            while(i<=bottom){
                l.add(matrix[i][right]);
                i++;
            }
            right--;
            if(top<=bottom){
                i=right;
                while(i>=left){
                    l.add(matrix[bottom][i]);
                    i--;
                }
                bottom--;
            }
            if(left<=right){
                i=bottom;
                while(i>=top){
                    l.add(matrix[i][left]);
                    i--;
                }
                left++;
            }
        }
        return l;
    }
}
