import java.util.function.Function;

public class Main {
  public static void main(String[] args) {

    // Define a function that takes an integer and returns its cube
    Function<Integer, Integer> cube = new Function<Integer, Integer>() {
      @Override
      public Integer apply(Integer x) {
        return x * x * x;
      }
    };


    // Define a function (using a lambda expression) that takes an integer and returns its square
    Function<Integer, Integer> square = x -> x * x;
}

