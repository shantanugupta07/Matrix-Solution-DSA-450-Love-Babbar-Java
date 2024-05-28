import java.util.Stack;

class MaxRectangle{
    public int maxArea(int [][]A, int n, int m){
        if(n==0 || m==0){
            return 0;
        }
        int [][]maxheight=new int[n][m];
        int maxArea=0;
        for(int j=0; j<m;j++){
            maxheight[0][j]=A[0][j];
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                if(A[i][j]==1){
                    maxheight[i][j]=maxheight[i-1][j] +1;
                }

            }
        }
        for(int i=0; i<n; i++){
            maxArea= Math.max(maxArea, maxHistogramArea(maxheight[i]));

        }
        return maxArea;
    }
    private int maxHistogramArea(int []height){
        Stack<Integer> stack=new Stack<>();
        int maxArea=0;
        int i=0;
        while(i<height.length) {
            if(stack.isEmpty() || height[i]>=height[stack.peek()]){
                stack.push(i++);
            }
            else{
                int h=height[stack.pop()];
                int width=stack.isEmpty() ? i : i-stack.peek()-1;
                maxArea =Math.max(maxArea, h*width);
            }
        }
        while(!stack.isEmpty()){
            int h=height[stack.pop()];
            int width=stack.isEmpty() ? i : i-stack.peek()-1;
            maxArea=Math.max(maxArea, h*width);
        }
        return  maxArea;
    }
}
public class DSA_2_6_MaxRectangleMatrix {
    public static void main(String [] args){
        int [][]A= {{0, 1, 1, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0}};
        int n=4, m=4;
        MaxRectangle s= new MaxRectangle();
        System.out.println(s.maxArea(A, n, m));
    }
}
