/**
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class problem02 {
    public static void main(String[] args) {
        int i=0,j=1,temp,sum=0,lim=4000000;

        while (j<lim) {
            temp = i+j;
            i = j;
            j = temp;
            if (j%2==0) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
//output : 4613732