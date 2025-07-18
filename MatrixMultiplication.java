
package matrixmultiplication;
import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1, col1;
        System.out.println("Enter rows and columns of first matrix");
        row1 = sc.nextInt();
        col1 = sc.nextInt();
        System.out.println("Enter first matrix");
        int matrix1[][] = new int[row1][col1];
        for(int i = 0; i < row1;i++)
        {
            for(int j = 0; j < col1;j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }
        int row2, col2;
        System.out.println("Enter rows and columns of first matrix");
        row2 = sc.nextInt();
        col2 = sc.nextInt();
        System.out.println("Enter first matrix");
        int matrix2[][] = new int[row2][col2];
        int newMatrix[][] = new int[row1][col2];
        for(int i = 0; i < row2;i++)
        {
            for(int j = 0; j < col2;j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < row1; i++)
        {
            for(int j = 0; j < col2 ; j++)
            {
                newMatrix[i][j] = 0;
                for(int k = 0; k < col1;k++)
                {
                    newMatrix[i][j] += matrix1[i][k]-matrix2[k][j];
                }
            }
        }
        for(int row[] : newMatrix)
        {
            for(int y : row)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    
}
