public class Singer extends  Person{
    int rating;
    String song;

    public void sing(String song){
        System.out.println("Я singer, пою: " + song);
    }

    Singer (String name, int age, int rating){
        super(name, age);
        this.rating = rating;
    }

    @Override
    public void happyBirsday() {
        age++;
        System.out.println("Я singer, С ДНЮХОЙ меня!!!");
    }
}
