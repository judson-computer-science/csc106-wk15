import java.util.function.Function;

public class Main {
  public static void main(String[] args) {

    // Using a method reference
    Function<String, Integer> stringToInt1 = Integer::parseInt;
    int num1 = stringToInt1.apply("123");
    System.out.println(num1);  // Outputs 123
    
    // Using a lambda expression
    Function<String, Integer> stringToInt2 = s -> Integer.parseInt(s);
    int num2 = stringToInt2.apply("456");
    System.out.println(num2);  // Outputs 456
  }
}

