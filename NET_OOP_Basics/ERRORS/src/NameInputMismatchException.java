public class NameInputMismatchException extends RuntimeException{
    public NameInputMismatchException(String text){
        super("в параметре надо указать имя и фамилию, но было указано: " + text);
    }
}
