public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tanya", 15);
        System.out.println("person: " + person.getAge() + ", " + person.name);

        Singer singer = new Singer("Nick", 22, 3);
        System.out.println("singer: " + singer.getAge() + ", " + singer.name + ", rating " + singer.rating);

        Artist artist = new Artist("Olga", 24, 5);
        System.out.println("artist: " + artist.getAge() + ", " + artist.name + ", rating " + artist.rating);

    }
}