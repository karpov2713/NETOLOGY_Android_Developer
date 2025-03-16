import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Logger logger = new SimpleLogger();
        logger.log("Сходил в кино");
        Thread.sleep(500);

        logger.log("Сходил в магазин");
        Thread.sleep(500);

        Logger logger1 = new SmartLogger();
        logger1.log("Сходил в кино");
        Thread.sleep(500);

        logger1.log("Сходил в магазин");
        Thread.sleep(500);

        logger1.log("Забыл витамины. Ошибка");
        Thread.sleep(500);

        logger1.log("Вернулся в аптеку.");
    }
}