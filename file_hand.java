import java.io.*;
/*public class file_hand{
  public static void main(String[] args){
    FileInputStream fis=null;
    try{
      fis=new FileInputStream("test.txt");
      //read method returns integer value of the character
      int i;
      while((i=fis.read())!=-1){
        System.out.print((char)i);
      }
      //we've used char typecasting because read method returns integer value of the character
      
      }catch (Exception e){
      System.out.println(e);
      }finally{
        try{
          fis.close();
        }catch (IOException e) {
          System.out.println(e);
        }      
    }
  }
}*/

//using character stream
/*public class file_hand{
  public static void main(String[] args){
    FileReader fr=null;
    try{
      fr=new FileReader("test.txt");
      //read method returns integer value of the character
      int i;
      while((i=fr.read())!=-1){
        System.out.print((char)i);
      }
      //we've used char typecasting because read method returns integer value of the character

      }catch (Exception e){
      System.out.println(e);
      }finally{
        try{
          fr.close();
        }catch (IOException e) {
          System.out.println(e);
        }      
    }
  }
}
*/

//q. write a program to read a file and write it to another file using characeter stream
/*public class  file_hand{
  public static void main(String[] args){
    File f=new File("ques.txt");
    try{
      f.createNewFile();
    System.out.println(f.exists());
    }catch (IOException e){
      System.out.println(e);
    }
    FileReader fr=null;
    try{
      fr=new FileReader("test.txt");
      //read method returns integer value of the character
      int i;
      while((i=fr.read())!=-1){
        fw.write((char)i);
      }
      //error coz fw is defined in another try block thus it is not accessible here
    }catch (Exception e){
      System.out.println(e);
    }

    FileWriter fw=null;
    try{
      fw=new FileWriter("ques.txt");
    }catch (Exception e){
      System.out.println(e);
    }
  }
}*/
public class  file_hand{
  public static void main(String[] args){
    FileReader fr=null;
    FileWriter fw=null;
    try{
      fr=new FileReader("test.txt");
      fw=new FileWriter("ques.txt");
      int i;
      while((i=fr.read())!=-1){
        fw.write((char)i);
     }
    }catch (Exception e){
      System.out.println(e);
    }finally{
      try{
        fr.close();
      }catch (IOException e) {
        System.out.println(e);
     }
  }
  }
}
