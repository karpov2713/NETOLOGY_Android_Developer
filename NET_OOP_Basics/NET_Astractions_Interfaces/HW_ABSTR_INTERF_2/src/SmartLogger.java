import java.time.LocalDateTime;

public class SmartLogger implements Logger{

    public static int callCount = 0;


    @Override
    public void log(String msg) {
        ++callCount;
        System.out.println("INFO#" + callCount + " " + LocalDateTime.now() + msg);
    }
}
