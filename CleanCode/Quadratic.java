public class Quadratic {
    public static double root1(String line) {
        double determinant = determinant(a, b, c);

        return (-b + Math.sqrt(determinant) / (2*a));
    }

    public static double root2(int a, int b, int c) {
        return b*b - 4*a*c;
    }
}
