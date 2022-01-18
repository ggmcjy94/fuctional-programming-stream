import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<String> collect = Stream.of("One", "Two", "Three")
                .filter(obj -> !obj.equals("One"))
                .peek(obj -> System.out.println("Peeked = " + obj))
                .collect(Collectors.toList());


        IntStream.of(1,23,4,5,6,7)
                .skip(3)
                .filter(i -> i > 3)
                .forEach(i -> System.out.println("i = " + i));


    }
}
