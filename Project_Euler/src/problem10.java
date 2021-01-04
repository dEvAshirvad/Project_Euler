/**
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */

public class problem10 {   

    public static boolean isprime(long n)

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
        long sum = 0,n=0;

        while (n<2000000) {
            n++;
            if (isprime(n)) {
                sum += n;
            }
        }

        System.out.println(sum);
    }
}
//output : 142913828922