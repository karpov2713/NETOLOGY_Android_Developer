public class Main {
    public static void main(String[] args) {
        SimpleLogger simple = new SimpleLogger();
        simple.log(" у нас");

        SmartLogger smart = new SmartLogger();
        smart.log(" сейчас");

        smart.log(" еще раз");
    }
}