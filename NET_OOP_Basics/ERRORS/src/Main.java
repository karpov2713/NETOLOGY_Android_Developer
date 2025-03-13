import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        try {
            String s = "Hello";
            char c = get10th(s);
            System.out.println("Ответ был: " + c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("ERROR 1");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR 2");
            System.out.println(e);
        }
        System.out.println("Bye!");
    }

    public static char get10th(String s) {
        System.out.println("Начинаем извлечение символа");
        char c = s.charAt(10);
        System.out.println("Вынули символ");
        return c;
    }
}