public class object {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        calculater calc = new calculater ();
        int result = calc . add (num1,num2);
        System.out.println(result);

    }
}
   class calculater
{
    public int add (int n1,int n2)
    {
        int r = n1 +n2;
        return r ;
    }
}