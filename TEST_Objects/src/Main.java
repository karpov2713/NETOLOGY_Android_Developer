public class Main {

    public static final String TEXT = "aaababaabaaaabaabaabaabaaababaabaaababaabaaaabaabaabaabbabaabaaababaababaabaabaabaaabbaab";
    public static final String PATTERN = "aab";

    public static void main(String[] args) {
        int count = 0;
        String text = TEXT;

        for (int i = 0; i < TEXT.length(); i++) {
            if(text[i] == "a" && TEXT[i + 1] == "a" && TEXT[i + 2] = "b"){
                count++;
            }
        }

        System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");
    }
}