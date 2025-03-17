import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PasswordChecker checker = new PasswordChecker();

         try {
             System.out.println("Введите мин. длину пароля: ");
             int minLength = Integer.parseInt(sc.nextLine());
             checker.setMinLength(minLength);

             System.out.println("Введите максимальное количество повторений символов: ");
             int maxRepeats = Integer.parseInt(sc.nextLine());
             checker.setMaxRepeats(maxRepeats);
         } catch (IllegalArgumentException e){
             System.out.println(e.getMessage());
         }

         try {
             while (true){
                 System.out.println("Введите пароль или end: ");
                 String password = sc.nextLine();
                 if("end".equals(password)){
                     break;
                 }

                 System.out.printf(checker.verify(password) ? "Подходит!":"Не подходит!");
             }
         } catch (IllegalStateException e){
             System.out.println(e.getMessage());
         }
    }
}