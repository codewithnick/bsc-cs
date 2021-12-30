import java.net.*;  
import java.io.*;  
class Server{  
    Server(int port){
        try{
            ServerSocket ss=new ServerSocket(port);  
            Socket s=ss.accept();  
            DataInputStream din=new DataInputStream(s.getInputStream());    
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            
            String str="";  
            while(!str.equals("stop")){  
                str=din.readUTF();  
                System.out.println("client says: "+str);  
                }  
            din.close();  
            s.close();  
            ss.close();  
            }
        catch(Exception e){
                
            }
    }
    public static void main(String[] args){
       Server s= new Server(3333);
    }
}  