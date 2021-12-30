public class TryCatch {  
  
    public static void main(String[] args) {

        try {
          int divideByZero = 2 / 0;
    System.out.println("Dividing");
        }
        catch (ArithmeticException ae) {
    System.out.println("ArithmeticException => " + ae.getMessage());
        }
    
      
}  }
