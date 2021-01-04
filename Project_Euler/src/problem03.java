/**
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

public class problem03 {
    public static void main(String[] args) {
        double out = 0;
        double m = 600851475143d;
        for (double n = 3; n < m; n += 2) {
            while (m % n == 0) {
                out = n;
                m = m / n;
            }
        }
        System.out.println("" + ((m == 1)?(int)out:(int)m));
    }
}
//output : 6857