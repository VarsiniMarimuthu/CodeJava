class MatrixDiagonal {
    public int diagonalSum(int[][] mat) {
            int sum=0;
            int n=mat.length;
            int i=0,j=0;
            while(i<n){
                sum+=mat[i][j];
                i++;
                j++;
            }
            i=0;
            j=n-1;
            while(j>=0){
                if(i!=j)
                sum+=mat[i][j];
                i++;
                j--;
            }
            return sum;
    }
}