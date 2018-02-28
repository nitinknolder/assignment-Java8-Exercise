import java.util.*;
import java.util.stream.IntStream;

public class Operations {

  public static void main(String args[]) {


    List<Integer> list1= Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> resultList = new ArrayList<>();
   list1.forEach(x -> {
      if (findPrime(x))
      {
        resultList.add(x);
      }

    });
//    resultList.forEach(res -> System.out.println("Output : " + res));
    list1.forEach(Operations::findPrime);
    resultList.forEach(System.out::println);



//    list1.forEach(x -> {
//      if (findPrime(x))
//      {
//        Random randomNumber = new Random();
//        Integer randomInt =  list1.get(randomNumber.nextInt(list1.size()));
//      }
//
//    });
//    randomInt.forEach(res -> System.out.println("Output : " + res));

  }

  private static boolean findPrime(int list1) {
    for (int i = 2; i <= list1 / 2; i++) {
      if (list1 % i == 0) {
        return false;
      }
    }
    return true;
  }
}

