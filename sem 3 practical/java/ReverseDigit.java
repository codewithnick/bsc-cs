class ReverseDigit{
    int reverse(int digit){
        int x=0,sum=0;
        while(digit>0){
            sum=sum*10;
            x=digit%10;
            sum=sum+x;
            digit=digit/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int digit = Integer.parseInt(args[0]);
        ReverseDigit obj=new ReverseDigit();
        digit=obj.reverse(digit);
        System.out.println("reversed digit is "+digit);
    }
}