
import java.util.Arrays;
        import java.util.List;

public class FilterPojo {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("test", 30),
                new Person("jack", 20),
                new Person("lawrence", 40),
                new Person("jack", 25)
        );

        Person result1 = persons.stream()
                .filter(p -> "jack".equals(p.getName()) && 25 == p.getAge())
                .findAny()
                .orElse(null);
        Person result2 = persons.stream()
                .filter(p -> "jack".equals(p.getName()))
                .findFirst()
                .orElse(null);

        System.out.println("result 1 :" + result1);
        System.out.println("result 2 :" + result2);


    }


}