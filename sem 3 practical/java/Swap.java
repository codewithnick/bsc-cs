class Swap{
    int x,y;
    void set(int p,int q){
        x=p;
        y=q;
    }
    void display(){
        System.out.println("x ="+x+" y= "+y);
    }
    void interchange(){
        int temp=x;
        x=y;
        y=temp;
    }
    public static void main(String[] args) {
        Swap s1= new Swap();
        s1.set(10,20);
        System.out.println("before swapping");
        s1.display();
        System.out.println("after swapping");
        s1.interchange();
        s1.display();
    }
}