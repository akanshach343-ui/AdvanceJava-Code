import java.io.*;

//to refer to a file, we create object for it.

public class file_handling{
  public static void main(String[] args){
    //on this compiler directly give file name else use c drive and then file name
    File f=new File("C:\\thro.java");
    System.out.println(f.exists());
    try{
    if(f.createNewFile()){
      System.out.println("file created successfully");
    }
    }catch (IOException e){
      System.out.println(e);
    }
    System.out.println(f.exists());
    System.out.println(f.getName());
System.out.println(f.getAbsolutePath());
    System.out.println(f.length());
    System.out.println(f.canRead());
    System.out.println(f.canWrite());
    System.out.println(f.delete());
    System.out.println(f.exists());
    
  }
}