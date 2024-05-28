class RowMatrixOne{
    int rowWithMax1s(int [][]A, int n, int m){
        int maxRowIndex=-1;
        int maxCount=0;
        int j=m-1;
        for(int i=0; i<n; i++){
            while(j>=0 && A[i][j]==1){
                j--;
                maxRowIndex=i;
            }
        }
        return maxRowIndex;
    }
}
public class DSA_2_4_RowWithMax1s {
    public static void main(String [] args){
        RowMatrixOne s= new RowMatrixOne();
        int [][]A={{0, 0, 1, 1},
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {0, 0, 0, 0}};
        int n=4; int m=4;
        System.out.println(s.rowWithMax1s(A, n, m));
    }
}
