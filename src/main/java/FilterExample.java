import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterExample {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");

        for (String name : names) {
            if (!name.equals("Sam")) {
                System.out.println("name = " + name);
            }
        }

        System.out.println("Function Style: ");


        names.stream()
                .filter(FilterExample::isNotSam) //new Predicate
                .forEach(name -> System.out.println("name = " + name)); //new Consumer
    }

    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }


}
