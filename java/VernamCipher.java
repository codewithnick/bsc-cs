import java.util.*;
public class VernamCipher{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter plaintext: ");
    String plaintext=sc.nextLine().toUpperCase();
    System.out.println("Enter key (key length should be equal to PT): ");
    String key=sc.nextLine().toUpperCase();
    String c=encrypt (plaintext, key);
    System.out.println("Cipher text: "+c); System.out.println("Plaintext: "+decrypt (c, key));
  }
  static String encrypt (String plaintext, String key){
    String ciphertext="";
    int cipher[]=new int[key.length()];
    for(int i=0;i<key.length(); i++){
      cipher[i]=plaintext.charAt(i)-'A' + key.charAt(i)-'A';}
      for(int i=0;i<key.length();i++){
        if (cipher[i]>25){
          cipher[i]=cipher[i]-26;
        }
      }
      for(int i=0;i<key.length();i++){
        int x=cipher[i]+'A';
        ciphertext+=(char)x;
      }
      return ciphertext;
    }

    static String decrypt (String ciphertext, String key){
      String plaintext="";
      int plain[]=new int[key.length()];
      for (int i=0;i<key.length();i++){
        plain[i]=ciphertext.charAt(i)-'A' - (key.charAt(i)-'A');}
        for(int i=0;i<key.length(); i++){
          if (plain[i]<0){
            plain[i]=plain[i] +26;
          }}
          for(int i=0;i<key.length();i++){
            int x=plain[i]+'A';
            plaintext+=(char)x;
          }
          return plaintext;
        }
      }
