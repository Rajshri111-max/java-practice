public class Stringbuffer {
    public static void main(String args [])
    {
        StringBuffer sb = new StringBuffer("Rajshri"+ " " );

        sb.append(" " + "Kalshetti");
        sb.insert(8,"java");
        sb.setLength(30);
        System.out.println(sb);

    }
}
