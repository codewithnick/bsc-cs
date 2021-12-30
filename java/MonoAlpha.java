public static string encrypt (String msg)

char cipherT[]=new char [ (mag.length())]:

for (int i=0;i<mag.length(); i++)

for (int i=0; j<26; j++)

(

if (plainAlpha[j]msg.charAt(i)).

cipherT[i]=cipherAlpha[j]; break;

Window

?

X

}

return

(new String (cipherT));

public static void main(String[] args)

Scanner sc = new Scanner (System.in);

System.out.println("Enter the string for Encryption:"); //System.out.println (decrypt (encrypt (message, 3), 3));

String message = new String();

message = sc.next();

System.out.println (encrypt (message));

ac.close();