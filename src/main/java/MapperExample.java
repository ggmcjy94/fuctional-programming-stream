import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapperExample {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");

        System.out.println("Imperative Style: ");

        for (String name : names) {
            if (!name.equals("Sam")) {
                User user = new User(name);
                System.out.println("user = " + user);
            }
        }

        System.out.println("Function Style: ");


        names.stream()
                .filter(MapperExample::isNotSam) //new Predicate
                .map(User::new) //new Function
                .forEach(name -> System.out.println("name = " + name)); //new Consumer

        List<User> collect = names.stream()
                .filter(MapperExample::isNotSam) //new Predicate
                .map(User::new) //new Function
                .collect(Collectors.toList());

    }

    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }

    static class User {
        private String name;
        private Integer age = 3;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
