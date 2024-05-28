class Search2DMatrixSorted{
    public boolean searchMatrix(int [][] matrix, int target){
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=m*n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int midElement=matrix[mid/n][mid%n];
            if(midElement == target){
                return true;
            }
            else if(midElement<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
}
public class DSA_2_2_Search2DMatrixSorted {
    public static void main(String [] args){
        int [][]A= {{1,2,5,7},
                    {10,11,16,20},
                    {23,30,34,60}};
        Search2DMatrixSorted s= new Search2DMatrixSorted();
        System.out.println(s.searchMatrix(A, 3));

    }
}
