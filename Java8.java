import java.util.ArrayList;
import java.util.List;

public class Java8 {
    public static void main(String[] args) {

        List<String> str=new ArrayList<>();

        str.add("name");
        str.add("age");

        for (String val:str) {
            System.out.println(val);
        }

        str.stream().forEach(ob->System.out.println("ob> "+ob));

    }
}
