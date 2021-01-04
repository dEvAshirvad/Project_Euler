/**
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class problem04 {
    public static void main(String[] args) {
        int maxNumber = 999;
        long maxAnswer = 0;
        for(int i = maxNumber; i >=0; i--) {
            for(int j = maxNumber; j >= 0; j--) {
                long possibleAnswer = i * j;
                if(possibleAnswer == reverse(possibleAnswer) && possibleAnswer > maxAnswer) {
                    maxAnswer = possibleAnswer;
                    break;
                }
            }
        }
        System.out.println(maxAnswer);
    }
    public static long reverse(long n) {
        long reverse = 0;
        while (n != 0) {
            long lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /= 10;
        }
        return reverse;
    }
}
//output : 906609