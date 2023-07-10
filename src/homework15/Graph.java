package homework15;

public class Graph {
    private int[][] matrix;

    public Graph(int[][] matrix) {
        this.matrix = matrix;
    }

    public int countEdges() {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    public boolean findWay(int start, int target) {
        boolean[] check = new boolean[matrix.length];
        return helper(start, target, check);
    }

    private boolean helper(int start, int target, boolean[] check) {
        if (matrix[start][target] == 1) {
            return true;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[start][i] == 1 && !check[i]) {
                check[i] = true;
                if(helper(i, target, check)){
                    return true;
                }

            }
        }

        return false;
    }
}
// {
// {1,2,4}
// {5,6,4}
// {1,2,4}
//}