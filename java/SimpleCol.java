import java.io.*;
import java.math.*;
import java.util.*;
public class SimpleCol
{
public static void main(String[] args)  throws IOException
{
String plaintext,ciphertext="",temp="";
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0;
System.out.print("Enter plaintext : ");
plaintext=br.readLine();
int plen=plaintext.length();
for(i=0;i<plen;++i)
{
if(plaintext.charAt(i)!=' ')
temp+=plaintext.charAt(i);
}
System.out.println("temp = "+temp);
int len=temp.length();
System.out.print("Enter no. of columns(max."+len+"): ");
int cols=Integer.parseInt(br.readLine());
if(cols<=len)
{
int rows=1,k=0;
if(len%cols==0)
rows=len/cols;
else
rows=(len/cols)+1;
char matrix[][]=new char[rows][cols];
for(i=0;i<rows;++i)
{
for(j=0;(j<cols)&&(k<len);++j)
{
matrix[i][j]=temp.charAt(k);
k++;
}
}
i--;
for(;j<cols;++j)
matrix[i][j]='$';
for(i=0;i<rows;i++)
{
for(j=0;j<cols;++j)
{
System.out.print(matrix[i][j]+" ");
}
System.out.println();
}
System.out.println();
int enCol[]=new int[cols];
for(i=0;i<cols;++i)
{
System.out.print("Enter column no. "+(i+1)+" : ");
enCol[i]=Integer.parseInt(br.readLine())-1;
}
if(enCol.length==cols)
{
for(i=0;i<cols;++i)
{
for(j=0;j<rows;++j)
{
ciphertext+=matrix[j][enCol[i]];
}
}
}
temp="";
for(i=0;i<ciphertext.length();++i)
if(ciphertext.charAt(i)!='$')
temp+=ciphertext.charAt(i);
ciphertext=temp;
System.out.println("Ciphertext : "+ciphertext);
}
else
System.out.println("Incorrect no. of columns!!!");
}
}