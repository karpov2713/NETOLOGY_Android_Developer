import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {

       List<String> list = new ArrayList<>();
       list.add("Petya");
       list.add("Olya");
       list.add("Tanya");

        for(Iterator<String> it = list.iterator();
            it.hasNext();){
            String name = it.next();
            System.out.println("name: " + name);
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
