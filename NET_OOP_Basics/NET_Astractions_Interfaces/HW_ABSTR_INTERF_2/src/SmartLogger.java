import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int callCounter = 0;

    @Override
    public void log(String msg) {

        System.out.printf("[%s]#%d [%s] %s\n",
                msg.toLowerCase().contains("ошибка") ? "ERROR":"INFO",
                callCounter++,
                LocalDateTime.now(),
                msg);
    }
}
