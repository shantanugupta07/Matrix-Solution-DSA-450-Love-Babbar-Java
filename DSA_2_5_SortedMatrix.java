import java.util.Arrays;

class SortedMatrixFlatten{
    int [][] sortedMatrix(int n, int [][]mat){
        int []A= new int[n*n];
        int index=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                A[index++]=mat[i][j];
            }
        }
        Arrays.sort(A);
        index=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j]=A[index++];
            }
        }
        return mat;
    }
}
public class DSA_2_5_SortedMatrix {
    public static void main(String [] args){
        SortedMatrixFlatten s= new SortedMatrixFlatten();
        int [][]mat={{10,20,30,40},
        {15,25,35,45},
        {27,29,37,48},
        {32,33,39,50}};
        int n=4;

        System.out.println(Arrays.deepToString(s.sortedMatrix(n, mat)));
    }
}
