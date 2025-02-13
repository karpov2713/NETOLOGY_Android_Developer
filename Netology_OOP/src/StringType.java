public class StringType {
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(s.replace('l', '@'));
        System.out.println(s);
        s = s.replace('l', '@');
        System.out.println(s);
        System.out.println(s.contains("wor@d"));
        System.out.println(s.startsWith("He"));
        System.out.println(s.indexOf(" "));

        s = "";
        s = s + "Hello";
        s = s + " ";
        s = s + "World";
        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println(sb);
    }
}
