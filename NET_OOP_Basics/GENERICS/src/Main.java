public class Main {
    public static void main(String[] args) {
        Memory<String> memory = new Memory<>();
        memory.save("Petya");
        memory.save("Olya");
        memory.save("Tanya");

        System.out.println(memory.getLast());

        String v1  = "Petya";
        String v2 = "Olga";
        String result = choose(true, v1, v2);
        System.out.println(result);
    }

    public static <T> T choose(boolean flag, T first, T second){
        if(flag){
            return first;
        } else {
            return second;
        }
    }
}
