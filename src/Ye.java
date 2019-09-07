import java.util.ArrayList;
import java.util.List;

public class Ye {
    public static void main(String[] args) {


        List<String> strings = new ArrayList<>();
        strings.add("MyString1");
        strings.add("MyString2");
//        for (String s : strings){
        for (int i = 0;i<strings.size();i++)
            System.out.println(strings.get(i));

        strings.sort((obj1,obj2) -> obj1.compareTo(obj2));


    }


    }
