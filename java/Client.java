import java.io.*;
import java.net.*;

public class Client
{
    private Socket soc;
    private DataOutputStream dos;
    private DataInputStream dis;

        public Client(String ipaddr,int port)
        {
            try {
                soc=new Socket(ipaddr,port);
                System.out.println("Client is connected");
                dis=new DataInputStream(System.in);
                dos=new DataOutputStream(soc.getOutputStream());

                String msg="";
                while(!msg.equals("End"))
                {
                    msg=dis.readLine();
                    dos.writeUTF(msg);

                }
                soc.close();
                dis.close();
                dos.close();

            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }

    public static void main(String ar[])
    {
        Client obj=new Client("127.0.0.1",3333);
    }
}