import java.util.function.Function;

public class Main {

  public static void main(String[] args) {

    // Use the applyFunction() method to square an integer
    int squared = applyFunction(5, x -> x * x);
    System.out.println("The square of 5 is: " + squared);

    // Use the applyFunction() method to convert a string to uppercase
    String uppercase = applyFunction("hello", String::toUpperCase);
    System.out.println("'hello' in uppercase is: " + uppercase);
  }


  // provide the implementation for applyFunction() below


}

