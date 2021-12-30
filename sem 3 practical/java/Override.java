//aim: show method Overriding
class Override{
    public static void main(String[] args) {
        Derived d= new Derived(5,6);
        d.Display();
    }
}
class Base{
    int x;
    Base(int p){
        this.x=p;
    }
    void Display(){
        System.out.println("inside base x= "+ x);
    }
}
class Derived extends Base{
    int y;
    Derived(int x,int y){
        super(x);
        this.y=y;
        
    }
    void Display()
    {
        System.out.println("Base x = "+x);
        System.out.println("Derived y ="+y);
    }
}