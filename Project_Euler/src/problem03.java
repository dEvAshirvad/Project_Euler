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
