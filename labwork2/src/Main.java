import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        0510
        C5 = 0 -> a * B, a - const
        C7 = 6 -> float
        C11 = 4 -> Обчислити суму найбільших елементів в рядках матриці з парними номерами
                    та найменших елементів в рядках матриці з непарними номерами
        */

        // зберігають значення розмірності матриці B[n,m] та множене a
        int n = 5;
        int m = 5;
        int a = 10;


        float[][] B = new float[n][m];
        float[][] C = new float[n][m];
        int rows = B.length;
        int columns = B[0].length;

        // Генеруємо матрицю В та виводимо її
        Random random = new Random();
        System.out.println("Matrix  B:");
        for (int i = 0; i < rows; i++) { // matrix.length -> m
            for (int j = 0; j < columns; j++) { // matrix[0].length -> n
                B[i][j] = (random.nextFloat(100));
                System.out.print(B[i][j] + "  ");
            }
            System.out.println();
        }

        // Обчислюємо матрицю С та виводимо її
        System.out.println("\nMatrix C = a * B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                C[i][j] = a * B[i][j];
                System.out.print(C[i][j] + "  ");
            }
            System.out.println();
        }

        //Сума найбільших елементів в рядках матриці з парними номерами
        float biggestSum = 0f;
        for(int i = 1; i < rows; i += 2) {
            float maximum = Float.MIN_VALUE;
            for(int j = 0; j < columns; ++j) {
                if (C[i][j] > maximum) {
                    maximum = C[i][j];
                }
            }
            biggestSum += maximum;
        }
        System.out.println("\nSum of biggest: " + biggestSum);

        //Сума найменших елементів в рядках матриці з непарними номерами
        float smallestSum = 0;
        for(int i = 0; i < rows; i += 2) {
            float minimum = Float.MAX_VALUE;
            for(int j = 0; j < columns; ++j) {
                if (C[i][j] < minimum) {
                    minimum = C[i][j];
                }
            }
            smallestSum += minimum;
        }

        System.out.println("Sum of smallest: " + smallestSum);
    }
}