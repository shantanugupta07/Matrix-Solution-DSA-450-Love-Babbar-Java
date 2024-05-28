import java.util.*;
class KthElement{
    public static int kthSmallest(int [][] mat, int n, int k){
        PriorityQueue<int []> minHeap= new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int r=0; r<n; r++){
            minHeap.offer(new int[]{mat[r][0], r, 0});
        }
        int result =0;
        for(int i=0; i<k; i++){
            int [] current = minHeap.poll();
            result =current[0];
            int r=current [1];
            int c= current[2];

            if(c+1<n){
                minHeap.offer(new int[]{mat[r][c+1], r, c+1});
            }
        }
        return result;
    }
}
public class DSA_2_9_KthElementMatrix {
    public static void main(String [] args){

        int [][] mat=     {{16, 28, 60, 64},
                {22, 41, 63, 91},
                {27, 50, 87, 93},
                {36, 78, 87, 94 }};
        int n=4;
        int k=3;
        System.out.println(KthElement.kthSmallest(mat, 4, 3));
    }
}
