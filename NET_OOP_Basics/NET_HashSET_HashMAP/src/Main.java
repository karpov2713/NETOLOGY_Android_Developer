import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Petya");
        list.add("Olya");
        list.add("Tanya");

        String name = list.get(1);
        System.out.println(name);
        System.out.println(list);
        list.set(1, "Kolya");
        System.out.println(list);

        MyMap<String, UserInfo> map = new MyMap<>();
        map.put("Petya", new UserInfo(8));
        map.put("Olya", new UserInfo(15));
        UserInfo info = map.get("Olya");
        System.out.println(info);

    }
}