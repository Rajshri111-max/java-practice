class computer
{
    public void playMusic() //void does not return value
    {
        System.out.println("Music is playing....");
    }
    public String getMeApen(int cost)
    {
        if (cost >=10)
            return "pen";
        else
            return "nothing";
    }
}

public class Method {
    public static void main(String[] args) {
        {
            computer obj = new computer();
            obj.playMusic();
            String str = obj .getMeApen(15);
            System.out.println(str);
        }
    }
}
