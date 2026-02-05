class mobile
{
    String brand ;
    int price ;
    static String name ;
    public void show()
    {
        System.out.println(brand + ":" + price +":"+ name );
       
    }
    public static void show1( mobile obj)
     {
            System.out.println(obj.brand + ":"+ obj.price + ":" + mobile.name);
    }
}
public class Static {
    public static void main(String[] args) {
        mobile obj = new mobile();
        obj.brand = "apple";
        obj.price = 15000;
        mobile.name= "smartphone";
        mobile obj1 = new mobile();
        obj1.brand = "samsung";
        obj1.price = 20000;
        mobile.name= "phone";
        obj.show();
        obj1.show();
        mobile.show1(obj1);
    }
}
