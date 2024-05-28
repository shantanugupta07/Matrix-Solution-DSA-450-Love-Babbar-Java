class MatrixPair{
    public static int findMaxValue(int[][] mat){
        int n= mat.length;
        int maxValue=Integer.MIN_VALUE;
        int [][] maxArr=new int[n][n];
        maxArr[n-1][n-1]=mat[n-1][n-1];
        for(int j= n-2; j>=0; j--){
            maxArr[n-1][j]=Math.max(mat[n-1][j],maxArr[n-1][j+1]);
        }
        for(int i=n-2; i>=0; i--){
            maxArr[i][n-1]=Math.max(mat[i][n-1], mat[i+1][n-1]);
        }
        for(int i=n-2; i>=0; i--){
            for(int j=n-2; j>=0; j--){
                maxValue=Math.max(maxValue, maxArr[i+1][j+1]-mat[i][j]);

                maxArr[i][j]=Math.max(mat[i][j], Math.max(maxArr[i+1][j], maxArr[i][j+1]));
            }
        }
        return maxValue;
    }
}
public class DSA_2_7_SpecificPairMatrix {
    public static void main(String [] args){
        int mat[][] = {
                { 1, 2, -1, -4, -20 },
                { -8, -3, 4, 2, 1 },
                { 3, 8, 6, 1, 3 },
                { -4, -1, 1, 7, -6 },
                { 0, -4, 10, -5, 1 }
        };

        System.out.println(MatrixPair.findMaxValue(mat));
    }
}
