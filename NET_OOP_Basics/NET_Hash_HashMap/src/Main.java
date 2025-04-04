import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Petya", 8);
        map.put("Tanya", 15);
        int age = map.get("Tanya");
        System.out.println(age);

        System.out.println("Hello World".hashCode());

        for (String key : map.keySet()){
            int value = map.get(key);
            System.out.println(key + " - " + value);
        }

        for (Map.Entry<String, Integer> kv : map.entrySet()){
            System.out.println(kv.getKey() + " = " + kv.getValue());
        }
    }
}