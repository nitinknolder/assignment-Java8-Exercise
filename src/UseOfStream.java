import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UseOfStream {
  public static void main(String args[]) {
    //  List<Integer> even = Arrays.asList(1,2,4,5,6);n

    /* Exercise 1: Find Even Number */
    List<Integer> list1 = IntStream.range(1, 10).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
    System.out.println("********Exercise 1**********");
    list1.forEach(System.out::println);

    /*Exercise 2: Find Multiple of 5 */
    List<Integer> myList =
        Arrays.asList(5, 10, 43, 80, 2);
    System.out.println("********Exercise 2**********");
    System.out.println("Multiple of 5");
    myList.stream().filter(mul -> mul % 5 == 0).collect(Collectors.toList()).forEach(System.out::println);

    /* Exercise3: Filter the name starts with S and ends With m*/

    List<String> nameList = Arrays.asList("shyam", "ram", "sam", "rohit", "udit", "shubham");
    System.out.println("********Exercise 3**********");
    System.out.println("name Starts with s and Ends With m");
    nameList.stream().filter(s -> s.startsWith("s")).filter(s -> s.endsWith("m")).collect(Collectors.toList()).forEach(System.out::println);

    /* Exercise 4: Add String Hello with the String if it starts from S in the List*/
    System.out.println("********Exercise 4**********");
    Stream.of("shubham", "sushil", "vinay", "ayush").filter(s -> s.startsWith("s")).map(s -> "Hello: " + s).collect(Collectors.toList()).forEach(System.out::println);

    /*Exercise 5: find city consist of 2 words*/
    System.out.println("********Exercise 5**********");
    List<String> cities = Arrays.asList("Delhi", "Andhra Pradesh", "Uttar Pradesh", "Chennai", "Mumbai");
    cities.stream().filter(s -> s.contains(" ")).collect(Collectors.toList()).forEach(System.out::println);

    /*Exercise 6:  Find out sum of all the integers greater than 10 in a list of integers.*/
    System.out.println("********Exercise 6**********");
System.out.println("Sum Of Number: " + IntStream.range(5, 18).filter(i -> i > 10).map(i -> i + 0).sum());

  }
}

