//q. write a program to read an image file and write it to another file
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class img{
  public static void main(String[] args){
    FileInputStream fs=null;
    FileOutputStream fw=null;
    try{
      fs=new FileInputStream("chocolate.jpg");
      fw=new FileOutputStream("outp.jpg");
      int count=0;
      int byteData;
      while((byteData=fs.read())!=-1){
        fw.write(byteData);
        if (count > 1000) break; 
      }
      System.out.println("image copied successfully");
    }catch (Exception e){
      System.out.println(e);
    }finally{
      try{
        fs.close();
        fw.close();
      }catch (IOException e){
        System.out.println(e);
        
      }
    }
    
  }
}
//stuck in infinite loop 