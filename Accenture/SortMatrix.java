import java.util.*;

class SortMatrix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size1 = obj.nextInt();
        int size2 = obj.nextInt();
        int num = obj.nextInt();
        
        int[][] mat = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                mat[i][j] = obj.nextInt();
            }
        }

        int[] result = MatrixSort(mat, num, size1, size2);
        if (result[0] != -1) {
            System.out.println("Position of found element: " + result[0] + " " + result[1]);
        } else {
            System.out.println("Not Found");
        }
    }

    public static int[] MatrixSort(int[][] mat, int num, int size1, int size2) {
        int[] flattened = new int[size1 * size2];
        int index = 0;

        // Flatten the 2D array into 1D
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                flattened[index++] = mat[i][j];
            }
        }

        // Sort the flattened array
        Arrays.sort(flattened);

        // Find the element in the sorted array
        for (int i = 0; i < flattened.length; i++) {
            if (flattened[i] == num) {
                // Map back to 2D array
                int row = i / size2;
                int col = i % size2;
                return new int[]{row, col};
            }
        }

        // If not found, return -1
        return new int[]{-1, -1};
    }
}
