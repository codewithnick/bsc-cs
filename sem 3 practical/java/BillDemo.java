class BillRate{
    double rate=400;
    double check(int calls){
        
        if(calls>150){
            rate+=(calls-150)*0.80;
        }
        return rate;
    }
}
class BillDemo{
    static int phno,calls;
    public static void main(String[] args) {//command line argument
        phno=Integer.parseInt(args[0]);
        calls=Integer.parseInt(args[1]);
        BillRate obj=new BillRate();
        double amount=obj.check(calls);
        System.out.println("total bill for "+phno+" for "+calls +" calls is "+amount);
    }
}