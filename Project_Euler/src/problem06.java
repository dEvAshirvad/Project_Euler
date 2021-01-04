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
