import java.io.DataInputStream;
class ReadDemo
{
    public static void main(String[] args) {
        DataInputStream in =new DataInputStream(System.in);
        int num=0;
        float f1=0.0f;
        try {
            System.out.println("enter an integer: ");
            num=Integer.parseInt(in.readLine());
            System.out.println("enter an float: ");
            f1=Float.valueOf(in.readLine()).floatValue();
        } catch (Exception e) {}

        System.out.println("square of integer is "+(num*num));
        System.out.println("square of float is "+(f1*f1));
    }
}