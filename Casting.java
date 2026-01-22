public class Casting {
    public static void main(String args [])
    {
       // byte b = 127;
       // int a = 12;
       // byte k= (byte)a;

       // System.out.println(k);
       int a =257;
       byte k = (byte)a;
       System.out.println(k);
       float f = 5.6f;
       int t = (int )f;
       System.out.println(t);
       //type ptomotion
       byte d= 10;
       byte e= 30;
       int result = d*e;
       System.out.println(result);

    }
}
