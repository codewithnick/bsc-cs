//wap to read from a file and copy into another file 
import java.io.*;
class CopyFile{
    public static void main(String[] args) {
        File FI =new File("input.txt");
        File FO =new File("output.txt");

        FileReader fr=null;
        FileWriter fw=null;
    
    try{
        fr=new FileReader(FI);
        fw=new FileWriter(FO);
        int ch;
        while((ch=fr.read())!=-1)
        { char c=(char)ch;
           
            fw.write(ch);
            System.out.print(" "+c);
        }
    }
    catch(IOException e){
        System.out.println(e);
        System.exit(-1);
    }
    finally{
        try{
            fr.close();
            fw.close();

        }
        catch(IOException e){}
    }
}
}