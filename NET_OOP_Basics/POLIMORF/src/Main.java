public class Main {
    public static void main(String[] args) {
        Singer singer = new Singer("Tanya", 15, 4);

        //person.happyBirthday(); // Будет выполнен вариант класса Singer

        //Person person = new Person("Petya", 8);
        //Singer singer = new Singer("Tanya", 15, 3);

        System.out.println(checkPerson(singer));
    }

    public static boolean checkPerson(Person person) {
        if (person.getAge() < 18) {
            return false;
        } else {
            return true;
        }
    }
}