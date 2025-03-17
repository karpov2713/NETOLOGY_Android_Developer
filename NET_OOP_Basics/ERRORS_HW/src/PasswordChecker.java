public class PasswordChecker {
    private int minLength;
    private int maxRepeats;

    public void setMinLength(int minLength) {
        if (minLength < 0) {
            throw new IllegalArgumentException("Длина пароля не может быть отрицательной!");
        }
        this.minLength = minLength;
    }

    public void setMaxRepeats(int maxRepeats) {
        if (maxRepeats <= 0) {
            throw new IllegalArgumentException("Количество повторений должно быть больше 0");
        }
        this.maxRepeats = maxRepeats;
    }

    boolean verify(String password) {
        if (minLength == -1 || maxRepeats == -1) {
            throw new IllegalStateException("Чекек не настроен");
        }

        if (password.length() < minLength) {
            return false;
        }

        int counter = 0;
        char previousLetter = password.charAt(0);
        for (char letter : password.toCharArray()) {
            if (letter == previousLetter) {
                counter++;
            } else {
                counter = 1;
            }

            if (counter > maxRepeats) {
                return false;
            }

            previousLetter = letter;
        }
        return true;
    }
}
