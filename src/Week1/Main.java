package Week1;

public class Main {
    public static void main(String[] args) {
        double a = 1, b = -3, c = 2; // Ví dụ: phương trình x^2 - 3x + 2 = 0
        double[] roots = solveQuadraticEquation(a, b, c);
        if (roots.length == 2) {
            System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + roots[0] + ", x2 = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Phương trình có nghiệm kép: x = " + roots[0]);
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }

    public static double[] solveQuadraticEquation(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{x1, x2};
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return new double[]{x};
        } else {
            return new double[]{};
        }
    }
}