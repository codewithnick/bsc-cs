import java.io.*;
class ConsoleInput
{
    
    public static void main( String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]= new String[100];
        System.out.println("enter lines of code");
        System.out.println("enter 'stop' to quit");
        for(int i=0;i<100;i++){
            str[i]=br.readLine();
            if(str[i].equals("stop"))
                break;
            
        }
        System.out.println("\n\n her is your data...\n\n");
        for(int i=0;i<100;i++){
            if(str[i].equals("stop"))
                break;
            System.out.println(str[i]);            
        }
    }
}
