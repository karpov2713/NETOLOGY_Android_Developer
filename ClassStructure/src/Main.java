public class Main {
    public static void main(String[] args) {
//        String name = "Petya";
//        int age = 8;
//        int rating = 3;

        Singer singer = new Singer();
        singer.name = "Petya";
        singer.age = 8;
        singer.rating = 3;
        f(singer);

        A.x = 5; // При обращении к статическому полю не требуется объявления экземпляра объекта.
    }

    public static void f(Singer singer){
        System.out.println("Name: " + singer.name + ", Age: " + singer.age + ", Rating: " + singer.rating + ".");
    }

}