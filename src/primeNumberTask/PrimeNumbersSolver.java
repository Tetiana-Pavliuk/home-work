package primeNumberTask;

public class PrimeNumbersSolver {
    public static void main(String[] args) {
        long from = 8;
        long to = 100;
        for (long i = from; i <= to; i++) {
            boolean isPrimitive = true;
                for (long j=2; j<i; j++) {
                    if (i%j == 0) {
                        isPrimitive = false;
                        break;}
                }
                if (isPrimitive) {
                System.out.println(i);}
        }
    }
}
