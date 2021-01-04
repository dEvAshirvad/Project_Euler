/**
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class problem09 {
    public static void main(String[] args) {

        double num = 1000.0;
        double b = 0;
    
        for(int a = 2 ; a <= (num/3 - 1); a++){
              b = ( num - ( 500*num / (num-a)));
    
              if(b == (int)b){
                  System.out.println((int)(a*b*(num-a-b)));
                  break;
              }
        }
    }
}
//output : 31875000