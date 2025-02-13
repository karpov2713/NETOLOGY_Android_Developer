import java.util.ArrayList;
import java.util.Scanner;

public class ReaferenceTypes {
    public static void main(String[] args) {
        String s = "Hello";
        int x = 10;
        f(s);
        Scanner scanner = new Scanner(System.in);

        ArrayList list = new ArrayList();
        System.out.println(list);
        list.add("Anya");
        list.add("Petya");
        list.add("Olya");
        System.out.println(list);

        ArrayList list2 = list;
        list2.remove("Olya");
        System.out.println(list + " list");
        System.out.println(list2 + " list2");
        list.add("Olya");

        ArrayList list1 = new ArrayList();
        list1.add("Anya");
        list1.add("Petya");
        list1.add("Olya");

        System.out.println(list == list1);
        System.out.println(list.equals(list1));

    }

    public static void f(String name){
        System.out.println(name);
    }

}
