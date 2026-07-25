class Solution{
    public static void setZeroes(int[][] mat) {
        // write logic here...
        int row = mat.length;
        int col = mat[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;
        for (int i = 0; i < col; i++) {
            if(mat[0][i] == 0){
                firstRowZero = true;
                break;
            }
        } 
        for (int i = 0; i < row; i++) {
            if(mat[i][0] == 0){
                firstColZero = true;
                break;
            }
        } 
        for(int i = 1 ; i < row ; i++) {
            for(int j = 1; j < col; j++) {
                if(mat[i][j] == 0){
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }
        for(int i = 1 ; i < row ; i++) {
            for(int j = 1; j < col; j++) {
                if(mat[i][0] == 0 || mat [0][j] == 0){
                    mat[i][j] = 0;
                }
            }
        }
        if(firstRowZero == true) {
            for (int i = 0; i < col; i++) {
                mat[0][i] = 0;
            } 
        }
        if(firstColZero == true) {
            for (int i = 0; i < row; i++) {
                mat[i][0] = 0;
            } 
        }
    }
}
class SetMatrixZero{
    public static void main(String[] args) {
        int [][] mat = {
            {1,2,3},
            {0,5,7},
            {1,6,0}
        };
        Solution.setZeroes(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                    System.out.print(mat[i][j]+" ");
            }
            System.out.println();
            
        }
    }
}

