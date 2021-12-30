class Triangle{
    public static void main(String[] args) {
        int num= Integer.parseInt(args[0]),i,j;
        for(i=0;i<=num;i++){
            for(j=1;j<=i;j++){
                System.out.print(" ");
                System.out.print(i);                
            }
            System.out.println("\n");
        }
        System.out.println("done");
    }
}