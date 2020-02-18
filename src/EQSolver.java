//The very first task
public class EQSolver {
    public static void main(String[] args) {
       double a = 1;
       double b = 20;
       double c = 3;

       double x1;
       double x2;

       double discriminant = b*b - 4*a*c;
       if (a == 0) {System.out.println("Cannot divide to 0");
       } else if (discriminant >= 0) {
          x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
          x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
          System.out.println(x1);
          System.out.println(x2);
       }
       else {System.out.println("There is no solution");}
    }
}
