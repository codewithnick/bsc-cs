import java.util.Scanner;
public class New
{    
    public static final String Alphabet="abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a="";
        System.out.println("Enter a sample message:");
        a=sc.nextLine();
        System.out.println("The encrypted form:"+encrypt(a,3));
        System.out.println("The decrypted form:"+decrypt(encrypt(a,3),3));
    }
   
     public static String encrypt(String msg,int shift){
         String cipher1="";
         int ascii=0;

         for(int i=0;i<msg.length();i++){
              char ch=msg.charAt(i);
              if (Character.isWhitespace(ch)){
                  cipher1+=' ';
                  continue;
              }
              int pos=Alphabet.indexOf (msg.charAt(i));
              int cc= (pos+shift)%26 ; 
              char replace=Alphabet.charAt(cc); 
              cipher1+=replace;               
         }
         
        return cipher1; 
     }
     
    public static String decrypt(String msg,int shift){
        String cipher1="";
         int ascii=0;

         for(int i=0;i<msg.length();i++){
              char ch=msg.charAt(i);
              if (Character.isWhitespace(ch)){
                  cipher1+=' ';
                  continue;
              }
              int pos=Alphabet.indexOf (msg.charAt(i));
              int cc= (pos-shift)%26 ; 
              char replace=Alphabet.charAt(cc); 
              cipher1+=replace;               
         }
         
        return cipher1; 
    }
}