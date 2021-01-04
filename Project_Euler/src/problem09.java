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