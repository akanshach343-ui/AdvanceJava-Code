//creating exception class (runtimeexception se extend krayi thus it is unchecked exception)

/*class InvalidMarksException extends RuntimeException{
  InvalidMarksException(String message){
    super(message);
  }
}

public class  types_exception{
  public static void checkmarks(int marks){
    if(marks<0 || marks>100){
      throw new InvalidMarksException("marks cannot be negative");
    }
  }
  
  public static void main(String[] args){
    try{
      checkmarks(678);
  }catch(InvalidMarksException e){
      System.out.println(e);
  }
}
}
*/
//if checked exception then we have to write throws in the method signature, example below:

class InvalidMarksException extends Exception{
  InvalidMarksException(String message){
    super(message);
  }
}

public class  types_exception{
  public static void checkmarks(int marks) throws InvalidMarksException{
    if(marks<0 || marks>100){
      throw new InvalidMarksException("marks cannot be negative");
    }
  }

  public static void main(String[] args){
    try{
      checkmarks(678);
  }catch(Exception e){
      System.out.println(e);
  }
}
}