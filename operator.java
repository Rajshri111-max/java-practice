public class operator {
    public static void main(String[] args) {
         int x = 7;
         int y = 6;
         int a = 5;
         int b = 4;

         //boolean result = x>y && a<b;//logical and operater
        // boolean result = x>y && a>b; //both are true shows true result
        // boolean result = x>y || a<b;   //logical OR oprater shows false only if both of them are false 
        boolean result = x<y;
         System.out.println(!result);  //!not operater gives opposite result 
    }
}
