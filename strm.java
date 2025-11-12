import java.io.*;
/*public class strm{
  public static void main(String[] args){  
    FileOutputStream fos=null;
    try{
      fos=new FileOutputStream("test.txt");
      String s="Welcome to java";
      //byte mein cinvert krenge fos is byte and string is character array, thus we will create an array of bytes
      byte b[]=s.getBytes();
      fos.write(b);
      //output stream se write file create nhi hoti, but here write ka use kiya thus it created anew file as well as wrote inside it. if we dont write anything then it will create an empty file
      System.out.println("file created and written successfully");
    }catch(Exception e){
        System.out.println(e);
    }finally{
      try{
      fos.close();
    }catch (IOException e) {
      System.out.println(e);
    }
      //finally block mein close krenge taaki agar koi exception aaye to bhi file close ho jaye and get handled easily just like we did in the try block
  }
  }
}*/

//now using character stream
public class strm{
  public static void main(String[] args){
    FileWriter fw=null;
    try{
      fw=new FileWriter("test.txt");
      String s="Welcome to java";
      fw.write(s);
      //or directly fw.write("Welcome to java");
      System.out.println("file created and written successfully");
    }catch(Exception e){
        System.out.println(e);
    }finally{
      try{
        fw.close();

      }catch (IOException e){
        System.out.println(e);
      }
    }
  }
}