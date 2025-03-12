public class Singer extends Person {
    int rating;

    public Singer(String name, int age, int rating){
        super(name, age);
        this.rating = rating;
    }

    public void sing(String verse) {
        System.out.println("Я singer, пою: " + verse);
    }

    @Override
    public void happyBirsday() {
        super.happyBirsday();
        age++;
        System.out.println("Я пою себе С ДР!!!");
    }

    @Override
    public String toString() {
        return "Rating: [" + rating + "] " + name + " (" + age + " лет)";
    }
}
