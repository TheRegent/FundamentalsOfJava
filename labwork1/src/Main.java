public class Main {

    public static void main(String[] args) {
        double S = 0.0;
        double a = 3.2;
        double b = 3.5;
        double denominator;
        double numerator;
        int n = 8;
        int m = 8;
        final int C= 0;


        if ((a <= C && n >= C)||(b <= 0 && m >= 0)) {
            System.out.print("Error! Isn't divisible by 0.\n");
        }
        else {
            for (double i = a; i <= (double) n; ++i) {
                denominator = (i - C);
                for (double j = b; j <= (double) m; ++j) {
                    numerator = (i * j);
                        S += numerator / denominator;
                    }
                }
            System.out.println("S = " + S);
            }
    }
}