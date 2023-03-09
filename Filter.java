import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "test");

        List<String> result = lines.stream()                // convert list to stream
                .filter(a -> "test".equals(a))
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : spring, node

    }

}