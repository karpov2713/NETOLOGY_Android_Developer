public class Main {

    public static final String TEXT = "aaababaabaaaabaabaabaabaaababaabaaababaabaaaabaabaabaabbabaabaaababaababaabaabaabaaabbaab";
    public static final String PATTERN = "aab";

    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < TEXT.length(); i++) {

            if (TEXT.regionMatches(i, PATTERN, 0, 3)){
                count++;
            }
        }

        System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");
    }
}