/*public class thro{
  public static void validate(int age){
    if(age<18){
      throw new ArithmeticException("not eligible to vote");
    }else{
      System.out.println("eligible to vote");
    }
  }
  public static void main(String[] args){
   try{
      validate(2);
   }catch(ArithmeticException e){
     System.out.println(e);
   }
    System.out.println("continue");
  }

  
}*/
//throws exception code
import java.io.*;
public class thro{
  public static void validate(int age) throws IOException, FileNotFoundException{
    if(age<18){
      throw new IOException("not eligible to vote");
    }else{
      System.out.println("eligible to vote");
    }
  }
  public static void main(String[] args){
   try{
      validate(2);
   }catch(Exception e){
     System.out.println(e);
   }
    System.out.println("continue");
  }


}