import java.util.Scanner;
class Inheritance{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=0;
        while(k<5){
            System.out.println("\nSelect the Operation :\n");
            System.out.println("1.Display array elements");
            System.out.println("2.Display array sum");
            System.out.println("3.Display array average");
            System.out.println("4.Display array maximum");
            System.out.println("5.break");
            k=sc.nextInt();
            Menu m=new Menu(k); 
        }
    }
}
class Array{
    public  int[] a = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
}
class Menu extends Array{
    int i,sum=0,avg=0,max=0;
    Menu(int k){
        switch (k) {
            case 1:
                for(i=0;i<a.length;i++){
                    System.out.print(a[i]);
                }    
                break;
            case 2:
                for(i=0;i<a.length;i++){
                    sum+=a[i];
                }    
                System.out.println("sum :"+sum);
                break;
            case 3:
                for(i=0;i<a.length;i++){
                    sum+=a[i];
                }    
                avg=sum/a.length;                
                System.out.println("average: "+avg);
                break;
            case 4:
                for(i=0;i<a.length;i++){
                    if(a[i]>max){
                        max=a[i];
                    }
                }    
                System.out.println("max "+max);
                break;
            default:
                
                break;
        }
    }
}