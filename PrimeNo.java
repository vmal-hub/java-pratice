package Num;

public class PrimeNo {

    public static void main(String[] args) {
        int no = 9;
        boolean isPrime = true;
        int div = 2;

        while (div <= no / 2) {
            if (no % div == 0) {
                System.out.println("NOT PRIME");
                isPrime = false;
                break;
            }
            div++;
        }

        if (isPrime && no > 1) {
            System.out.println("PRIME");
        }
    }
}

