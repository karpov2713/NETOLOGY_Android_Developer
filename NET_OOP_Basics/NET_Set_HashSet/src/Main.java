import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Petya");
        set.add("Olga");
        set.add("Max");
        set.add("Nick");
        set.add("Petya");
        System.out.println(set);
        System.out.println(set.contains("Olga"));
    }
}