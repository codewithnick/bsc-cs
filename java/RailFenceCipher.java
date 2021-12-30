import java.util.*;
public class RailFenceCipher

{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the plain text: ");
		String plainText=sc.nextLine();
		
		System.out.println("Enter the key: ");
		int key=sc.nextInt();
		
		String text=encrypt(plainText,key);
		System.out.println(text);
		System.out.println(decrypt(text,key));
	}
	static String encrypt(String plainText,int key)
	{
		String cipherText="";
		boolean check=false;
		int j=0;
		int row=key;
		int col=plainText.length();
		char[][]a=new char[row][col];
		for(int i=0; i<col; i++)
		{
			if(j==0 || j==key-1)
				check=!check;
				a[j][i]=plainText.charAt(i);
				if(check)
					j++;
				else
					j--;
		}
		
		for(int i=0; i<row; i++)
		{
			for(int k=0; k<col; k++)
			{
				if(a[i][k]!=0)
					cipherText+=a[i][k];
			}
		}
		
		for(int i=0; i<row; i++)
		{
			for(int k=0; k<col; k++)
			{
				System.out.print(a[i][k]);
			}
			System.out.println();
		}
		return cipherText;
	}
	
	static String decrypt(String cipherText,int key)
	{
		String plainText="";
		boolean check=false;
		int j=0;
		int row=key;
		int col=cipherText.length();
		char[][]a=new char[row][col];
		for(int i=0; i<col; i++)
		{
			if(j==0 || j==key-1)
				check=!check;
				a[j][i]='*';
				if(check)
					j++;
				else
					j--;
		}
		for(int i=0; i<row; i++)
		{
			for(int k=0; k<col; k++)
			{
				System.out.print(a[i][k]);
			}
			System.out.println();
		}
		int index=0;
		check=false;
		for(int i=0; i<row; i++)
		{
			for(int k=0; k<col; k++)
			{
				if(a[i][k]=='*'&&index<col)
				{
					a[i][k]=cipherText.charAt(index++);
				}
			}
		}
		for(int i=0; i<row; i++)
		{
			for(int k=0; k<col; k++)
			{
				System.out.print(a[i][k]);
			}
			System.out.println();
		}
		j=0;
		for(int i=0; i<col; i++)
		{
			if(j==0 || j==key-1)
				check=!check;
				plainText+=a[j][i];
				if(check)
					j++;
				else
					j--;
		}
		return plainText;
	}
}