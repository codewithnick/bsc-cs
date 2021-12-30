class MultipleTryCatchDemo{
static void ProcedureA(){
try{
System.out.println("Inside procedure A");
throw new RuntimeException("Demo");
}
finally{
System.out.println("Inside procedure A finally");
}

}static void ProcedureB(){
try{
System.out.println("Inside procedure B");
return;
}
finally{
System.out.println("Inside procedure B finally");
}

}
static void ProcedureC(){
try{
System.out.println("Inside procedure C");

}
finally{
System.out.println("Inside procedure C finally");
}

}
public static void main(String args[]){
try{
ProcedureA();
}
catch (Exception e){

System.out.println("Caught Exception" +e);

  }
ProcedureB();
ProcedureC();
}
}