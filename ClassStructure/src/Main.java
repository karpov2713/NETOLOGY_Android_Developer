public class Main {
    public static void main(String[] args) {
//        String name = "Petya";
//        int age = 8;
//        int rating = 3;
        System.out.println("Max rating: " + Singer.maxRating);

        Singer singer = new Singer("Petya", 8, 3);
        System.out.println(singer);
        System.out.println("Max rating: " + Singer.maxRating);
//        singer.name = "Petya";
//        singer.age = 8;
//        singer.rating = 3;

        Singer singer2 = new Singer("Anya", 15, 4);
        System.out.println(singer2);
        System.out.println("Max rating: " + Singer.maxRating);

        Album album = new Album("Oy spring!",2021, singer2);

//        singer.sing("Good morning!");
//
//        System.out.println(singer.isTooYoung());



//        f(singer);
//        A.x = 5; // При обращении к статическому полю не требуется объявления экземпляра объекта.

//        Singer singer2 = new Singer();
//        singer2.name = "Anya";
//        singer2.age = 15;
//        singer2.rating = 4;
//        System.out.println(singer2);
    }

//    public static void f(Singer singer){
//        System.out.println("Name: " + singer.name + ", Age: " + singer.age + ", Rating: " + singer.rating + ".");
//    }

}
