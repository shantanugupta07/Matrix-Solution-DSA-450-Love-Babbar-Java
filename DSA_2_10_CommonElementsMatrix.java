import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CommonElementRow {
    public List<Integer> commonElements(int[][] mat) {
        // Number of rows in the matrix
        int m = mat.length;
        // Number of columns in the matrix
        int n = mat[0].length;

        // Hash map to store the frequency of elements
        Map<Integer, Integer> elementCount = new HashMap<>();

        // Initialize the map with the elements of the first row
        for (int j = 0; j < n; j++) {
            elementCount.put(mat[0][j], 1);
        }

        // Process subsequent rows
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Only update the count if the element is already present in the map
                if (elementCount.containsKey(mat[i][j]) && elementCount.get(mat[i][j]) == i) {
                    elementCount.put(mat[i][j], i + 1);
                }
            }
        }

        // Collect elements that are present in all rows
        List<Integer> commonElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            if (entry.getValue() == m) {
                commonElements.add(entry.getKey());
            }
        }

        return commonElements;
    }


}

public class DSA_2_10_CommonElementsMatrix {
    public static void main(String[] args) {
        CommonElementRow sol = new CommonElementRow();
        int mat[][] = {
                {1, 2, 1, 4, 8},
                {3, 7, 8, 5, 1},
                {8, 7, 7, 3, 1},
                {8, 1, 2, 7, 9}
        };

        List<Integer> commonElements = sol.commonElements(mat);
        for (int element : commonElements) {
            System.out.print(element + " ");
        }
    }
}
