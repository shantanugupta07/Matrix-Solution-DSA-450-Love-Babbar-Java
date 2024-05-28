class MedianMatrix{
    int median(int [][] matrix, int r, int c){
        int min=matrix[0][0];
        int max=matrix[0][c-1];
        for(int i=1; i<r; i++){
            if(matrix[i][0]<min){
                min=matrix[i][0];
            }
            if(matrix[i][c-1]>max){
                max=matrix[i][c-1];
            }
        }
        int desired=(r*c+1)/2;
        while(min<max){
            int mid=min+(max-min)/2;
            int place=0;
            for(int i=0; i<r; i++){
                place+=countLessEqual(matrix[i], mid);
            }
            if(place<desired){
                min=mid+1;
            }
            else{
                max=mid;
            }
        }
        return min;
    }
    int countLessEqual(int[] row, int target) {
        int low = 0, high = row.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
public class DSA_2_3_MedianMatrix {
    public static void main(String[] args){
        MedianMatrix m= new MedianMatrix();
        int [][]A= {{1}, {2}, {3}};
        System.out.println(m.median(A, 3, 1));
    }
}
