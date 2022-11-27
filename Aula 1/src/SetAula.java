import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class SetAula {
    public static void main(String[] args) {
        List<String> list = null;
        Set<String> hashSet = new HashSet<>(list);
        hashSet.forEach(itemSet -> System.out.println(itemSet));

        TreeSet<String> treeSet = new TreeSet<>();
        Set<String> hSet = treeSet;
        list = new ArrayList<>();

        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("d3");
        list.add("d2");
        list.add("d1");
        list.forEach(itemList -> System.out.println(itemList));
    }


}