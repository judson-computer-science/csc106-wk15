import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    // Create a list of four elements
    List<Integer> list = Arrays.asList(1, 2, 3, 4);

    // Use the map() intermediate operation to multiply each element by 2
    Stream<Integer> multiplied = list.stream().map(x -> x * 2);

    // Use the forEach() terminal operation to print the elements in the stream
    multiplied.forEach(System.out::println);

    // Use the reduce() terminal operation to sum the elements in the stream starting from zero
    int sum = list.stream().reduce(0, (a, b) -> a + b);

    // Print the sum
    System.out.println("The sum of the elements is: " + sum);
  }
}
