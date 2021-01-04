/**
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */

public class problem07{
    public static boolean isprime(int n)

    {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        int counter = 3;

        while ((counter * counter) <= n) {
            if (n % counter == 0) {
                return false;
            } else {
                counter += 2;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int primepos = 1, n = 1;

        while (primepos < 10001) {
            n = n + 2;

            if (isprime(n)) {
                primepos++;
            }
        }
        System.out.println(n);
    }
}
//output : 104743