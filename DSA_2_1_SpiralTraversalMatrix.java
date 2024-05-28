import java.util.ArrayList;

class SpiralTraversal{
    public ArrayList<Integer> spirallyTraversal(int matrix[][], int r, int c){
        ArrayList<Integer> result= new ArrayList<>();
        if(matrix==null || r==0 || c==0){
            return result;
        }
        int top=0; int bottom=r-1; int left=0; int right=c-1;
        while(top<=bottom && left<=right){
            for(int i= left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;

    }
}
public class DSA_2_1_SpiralTraversalMatrix {
    public static void main(String [] args){
        SpiralTraversal s= new SpiralTraversal();
        int [][]A={{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}};

        int r=4; int c=4;
        System.out.println(s.spirallyTraversal(A, r, c));
    }
}
