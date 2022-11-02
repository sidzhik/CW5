import java.util.Arrays;
public class Z3 {
    public static void main(String[] args) {
        int [] [] matrix = new int [10][10];
        int sum = 0;
        int n = 0;
        for(int i = 0; i < matrix.length; i++){


            for (int j = 0; j < matrix.length; j++){
                if (i == j) {
                    matrix [i][j] = n;
                    sum += matrix [i][j];
                    n++;
                }
                else matrix [i][j] = 0;
            }
        }

        for (int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));

        System.out.println("\n\nSum og the values of diagonal is: " + sum);
    }
}
