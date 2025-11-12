public class nested_exception{
  public static void main(String[] args){
    int[] arr = {10, 20, 30, 40, 50};
    
    try{
      System.out.println("Outer try block - accessing array elements");
      System.out.println("Element at index 2: " + arr[2]);
      
      try{
        System.out.println("Inner try block - performing division");
        int result = arr[1] / 0;
        System.out.println("Result: " + result);
      }catch(ArithmeticException e){
        System.out.println("Inner catch: ArithmeticException caught - " + e.getMessage());
      }
      
      System.out.println("Trying to access invalid array index");
      System.out.println("Element at index 10: " + arr[10]);
      
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Outer catch: ArrayIndexOutOfBoundsException caught - " + e.getMessage());
    }
    
    System.out.println("Program continues after exception handling");
  }
}
