/**
The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
3025 - 385 = 2640
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class problem06 {
    public static void main(String[] args) {
        int x=100,sum2=0;
        double temp = 0,sum=0;

        for (int i = 0; i <= x; i++) {
            sum += Math.pow(i, 2);
            sum2 += i;
            temp = Math.pow(sum2, 2);
        }
       System.out.println((int)temp-(int)sum);
    }
}
//output : 25164150