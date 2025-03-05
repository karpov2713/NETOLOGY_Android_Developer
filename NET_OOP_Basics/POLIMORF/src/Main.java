public class Main {
    public static void main(String[] args) throws Exception {
//        Singer singer = new Singer("Tanya", 15, 4);
//
//        //person.happyBirthday(); // Будет выполнен вариант класса Singer
//
//        //Person person = new Person("Petya", 8);
//        //Singer singer = new Singer("Tanya", 15, 3);
//
//        System.out.println(checkPerson(singer));

        Instrument[] instruments = {
                new Guitar(),
                new Piano(),
                new Flute(),
                new Guitar(),
        };

        boolean[][] shouldPlay = {
                {false, true, true, true, true, false},
                {true, false, true, false, true, false},
                {false, false, true, true, false, false},
                {false, true, true, true, true, false},
        };

        Song song = new Song(instruments, shouldPlay);
        song.play();
    }

//    public static boolean checkPerson(Person person) {
//        if (person.getAge() < 18) {
//            return false;
//        } else {
//            return true;
//        }
//    }
}