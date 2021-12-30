import java.util.StringTokenizer;  
class TokenizerDemo{  
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("my collage is bhavans"); 
   System.out.println("total no of token: "+st.countTokens());   
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
	
   }
} 
