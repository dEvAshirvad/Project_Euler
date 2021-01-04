public class problem01 {
    public static void main(String[] args) {
        int i,j=1000,sum=0;

        for (i = 0; i < j; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            
            }
        }
        System.out.println(sum);   
    }
}
