class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> array=new  ArrayList<Integer>();
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0,right=m-1,bottom=n-1,top=0;
       while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            array.add(matrix[top][i]);
        }
        top++;
        for(int j=top;j<=bottom;j++){
            array.add(matrix[j][right]);
        } right--;
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            array.add(matrix[bottom][i]);
        }
        bottom--;
        }
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            array.add(matrix[i][left]);
        }
        left++;

       }
       }

     return array;   
    }
}