import java.util.ArrayList;
import java.util.List;


public class Array {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        String[] v = {"abc", "def", "g", "h", "i"};
        int position = 2;
        String[] rezultat = new String[v.length-position];
        for (int i = position; i < v.length; i++) {
            rezultat[i-position] = v[i];
        }

        for (String s: rezultat){
            System.out.println(s);
        }

    }

}