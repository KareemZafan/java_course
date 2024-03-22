package day5;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] mat1 = {
                  {1, 2, 3}
                , {4, 5, 6}
                , {7, 8, 9}};
        int[][] mat2 = {
                {1, -9, 3}
                , {4, 0, 6}
                , {8, 8, 9}};


        int[][] result = addTwoMatrices(mat1, mat2);
        // print out result matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }


    private static int[][] addTwoMatrices(int[][] x, int[][] y){
        int [][] sum = new int[x.length][x.length];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                sum[i][j] = x[i][j] + y[i][j];
            }
        }
        return sum;
    }
}
