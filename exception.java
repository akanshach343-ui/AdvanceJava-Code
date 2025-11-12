public class exception{
  public static void main(String[] args){
    /*try{
      int a=50;
      int b=a/0;
      System.out.println(b);
      //here if i write Nullpointer exception then it will print the error but wont run the next line welcome to java
      //if kisi bhi line mein exception aagyi then uske baad wale lines execute nahi honge

      //you cannot write any statement between try and catch block

      //when we dont knwo the kind of exception then we use Exception class

      //catch(Exception e)){}

      
    }catch(ArithmeticException e){
      System.out.println("you cannot divide by zero");
      System.out.println(e);
      System.out.println(e.getMessage());
      //IT PRINTS THE MESSAGE OF THE EXCEPTION ONLY NOT THE NAME OF THE EXCEPTION LIKE java.lang.ArithmeticException: / by zero
  
  }
    System.out.println("Welcome to java"); */

 /*   try{
      String s=null;
      System.out.println(s.length());
    }catch(NullPointerException e){
      System.out.println(e);
    }
    //System.out.println("Welcome");
    try{
      int a[]={1,2,3};
      System.out.println(a[5]);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }
    System.out.println("Array indexing");*/

 /*   try{
      String s2="abc";
    int a=Integer.parseInt(s2);
    System.out.println(s2);
    }catch(NumberFormatException e){
      System.out.println(e);
    }
    System.out.println("Number format exception example or runtime exception"); */

    //we can write multiple catch blocks with a single try block

    //we must exception from child to parent class

    //Nested try block
   /* try{
      try{
      int a=10/0;
      System.out.println(a);
      }catch(ArithmeticException e){
        System.out.println(e);
      }
      try{
        String s=null;
        System.out.println(s.length());
      }catch(NullPointerException e){
        System.out.println(e);
      }
    }catch(Exception e){
      System.out.println(e);
    }*/

    //try block ke bahar hi exception aagyi that why inside vala try block ni chalaya

    //finally block
    //it is a block that is always executed whether exception is handled or not

    try{
      int a=50/0;
      System.out.println(a);
    }catch(Exception e){
      System.out.println(e);
    }finally{
      System.out.println("finally block is always executed");
    }
    
}
}