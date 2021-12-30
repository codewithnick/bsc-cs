import Animals.*;
class Elephant implements Animal
{
  public void type()
    {
       System.out.println("\n Elephant is viviparious");
    }
    public void food()
    {
      System.out.println("\n Elephant is herbivorious");
     }
}
class DemoPackage
{
  public static void main(String[] args)
  {
     Elephant e1 = new Elephant();
     e1.type();
     e1.food();
  }
}
