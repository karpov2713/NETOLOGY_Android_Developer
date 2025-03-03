public class Singer extends Person {
    public int rating;

    public Singer(String name, int age, int rating){
        super(name, age);
        this.rating = rating;
    }

    public void sing(String verse) {
        System.out.println("I sing: " + verse);
    }

    @Override
    public void happyBirthday() {
        super.happyBirthday();
        age++;
        System.out.println("I'm singing to me Happy Birthday!");
    }

    @Override
    public String toString() {
        return "[" + rating + "] " + name + " (" + age + " лет";
    }

}
