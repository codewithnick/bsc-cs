package PackDemo;
public class FactImp implements FactDemo{
    public int factorial(int i){
        int num=1;
        for(int j=1;j<=i;j++){
            num=num*j;
        }
        return num;
    }
}