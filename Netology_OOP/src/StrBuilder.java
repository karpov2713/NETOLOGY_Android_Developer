public class StrBuilder {
    public static void main(String[] args) {
        final int N = 10_000_000;

        System.out.println("Start!");
        //String s = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i % (N / 100) == 0) System.out.println((i / (N / 100)) + "%..."); // Вывод прогресса на экран
            //s = s + '!';
            sb.append('!');
        }
        String s = sb.toString();
        System.out.println("Finish");
        System.out.println("Generated string with " + s.length() + " length");
    }
}
