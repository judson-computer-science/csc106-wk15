import java.util.function.Function;

public class Main {
  public static void main(String[] args) {
    // Define a function that takes an integer and returns its square
    Function<Integer, Integer> square = x -> x * x;

    // Define a function that takes an integer and returns its cube
    Function<Integer, Integer> cube = new Function<Integer, Integer>() {
      @Override
      public Integer apply(Integer x) {
        return x * x * x;
      }
    };

    // Define a higher-order method that takes a function and an integer and applies the function to the integer
    int result1 = applyFunction(square, 5);
    int result2 = applyFunction(cube, 5);
    System.out.println(result1);  // prints 25
    System.out.println(result2);  // prints 125
  }

  public static int applyFunction(Function<Integer, Integer> f, int x) {
    return f.apply(x);
  }
}
