class StudentData
{
   int stuID;
   String Name;
   int Age;
   StudentData()
   {
       stuID = 100;
       Name = "nikhil singh";
       Age = 18;
   }
   StudentData(int num1, String str, int num2)
   {
      
       stuID = num1;
       Name = str;
       Age = num2;
   }
   
   public int getStuID() {
       return stuID;
   }
   public void setStuID(int stuID) {
       this.stuID = stuID;
   }
   public String getName() {
       return Name;
   }
   public void setName(String Name) {
       this.Name = Name;
   }
   public int getAge() {
       return Age;
   }
   public void setStuAge(int Age) {
       this.Age = Age;
   }

   public static void main(String args[])
   {
       //This object creation would call the default constructor
       StudentData myobj = new StudentData();
       System.out.println("Student Name is: "+myobj.getName());
       System.out.println("Student Age is: "+myobj.getAge());
       System.out.println("Student ID is: "+myobj.getStuID());

       /*This object creation would call the parameterized
        * constructor StudentData(int, String, int)*/
       StudentData myobj2 = new StudentData(555, "shivam", 25);
       System.out.println("Student Name is: "+myobj2.getName());
       System.out.println("Student Age is: "+myobj2.getAge());
       System.out.println("Student ID is: "+myobj2.getStuID()); 
  }
}