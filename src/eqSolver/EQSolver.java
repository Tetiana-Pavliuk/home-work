package eqSolver;

public class EQSolver {
    public static void main(String[] args) {
        double a = 1;
        double b = -7;
        double c = 0;

        double x1;
        double x2;

        double discriminant = b*b - 4*a*c;
        if (a == 0) {System.out.println("Cannot divide to 0");
        } else if (b == 0 && c == 0) {
            System.out.println("There is only one root: x = " + 0);
        } else if (b == 0) {
            if (-c/a < 0) {System.out.println("There is no solution");}
            else {
                x1 = Math.sqrt(-c / a);
                x2 = -Math.sqrt(-c / a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        } else if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            x1 = -b / (2 * a);
            System.out.println("There is only one root: x = " + x1);
        } else {
            System.out.println("There is no solution");
        }
    }
}
