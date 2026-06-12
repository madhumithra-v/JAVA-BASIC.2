public class PrimeNumbers {

    public static void main(String[] args) {

        int n = 50;

        System.out.println("Prime numbers from 1 to " + n + " are:");

        for (int num = 2; num <= n; num++) {

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
