public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ann", 30);
        person.setName("Petya");
        //person.age = 8;
        person.setAge(20);
        person.setAge(-10);
        System.out.println(person.getAge());
        System.out.println(person.isTooYoung());
        System.out.println(person.getName());

        Singer singer = new Singer("John", 28, 3);
        singer.setAge(10);
//        singer.happyBirthday();
//        singer.rating = 3;
        singer.sing("Happy morning!");
        singer.happyBirthday();
//        person.happyBirthday();
    }
}