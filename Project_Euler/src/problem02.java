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