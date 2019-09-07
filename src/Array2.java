import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array2 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("abc");
        strings.add("abc");
        strings.add("abc");
        List<String> result = strings.subList(2, strings.size());
        System.out.println(result);
    }
}