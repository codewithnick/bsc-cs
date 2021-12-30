// write a a java program to demonstrate the use of throwable class bt ,illustrating the object
//of that class extends throwable can be thrown and caught

import  java.lang.Exception;
class MyException extends Exception
{
    MyException(String msg)
    {
        super(msg);
    }
}
class TestException{
    public static void main(String args[]){
    int x=5,y=1000;
    try{
    float z=(float) x/ (float) y;
    if(z<0.01){
    throw new MyException ("Number is too small");
    }
    }
    catch(MyException e){
    System.out.println("Caught my Exception");
    System.out.println(e.getMessage());
    }
    finally{
    
    System.out.println("I am executed always");
    }
}
}
    