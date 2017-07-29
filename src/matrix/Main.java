package matrix;

/**
 * Created by Dimaster on 28.06.2017.
 * Matrix
 */
public class Main {
    public static void main(String[] args) {
        double[][] numbers = {{1,2,3,4},{5,6,7,8},{1,2,3,4}};
        double[][] numbers1 = {{2,4,6,8},{1,3,5,7},{2,4,6,8}};
        double[][] numbers3 = {{2,4,6,8},{1,3,5,7},{2,4,6,8},{1,2,3,4}};

        System.out.println("-----------------Add matrix_1 + matrix_2----------------");

        Matrix matrix1 = new Matrix(numbers);
        Matrix matrix2 = new Matrix(numbers1);
        IMatrix resultMatrix = matrix1.add(matrix2);
        resultMatrix.printToConsole();

        System.out.println("-----------------Sub matrix_1 * matrix_2----------------");

        Matrix matrix3 = new Matrix(numbers);
        Matrix matrix4 = new Matrix(numbers1);
        IMatrix resultMatrix1 = matrix3.sub(matrix4);
        resultMatrix1.printToConsole();

        System.out.println("-----------------Mul matrix_1 * matrix_2----------------");

        Matrix matrix5 = new Matrix(numbers);
        Matrix matrix6 = new Matrix(numbers3);
        IMatrix resultMatrix2 = matrix5.mul(matrix6);
        resultMatrix2.printToConsole();

        System.out.println("-----------------Mul na val----------------");

        Matrix matrix7 = new Matrix(numbers);
        double val = 2;
        IMatrix resultMatrix3 = matrix7.mul(val);
        resultMatrix3.printToConsole();

        System.out.println("-----------------Transpose----------------");

        Matrix matrix8 = new Matrix(numbers);
        IMatrix resultMatrix4 = matrix8.transpose();
        resultMatrix4.printToConsole();

        System.out.println("-----------------FillMatrix----------------");

        Matrix matrix9 = new Matrix(3,4);
        matrix9.fillMatrix(5);
        matrix9.printToConsole();

    }
}
