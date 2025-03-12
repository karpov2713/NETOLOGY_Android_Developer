public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void happyBirsday(){
        age++;
        System.out.println("С ДР person!");
    }

    public boolean isTooYoung() {
        if (age < 18) {
            return true;
        } else {
            return false;
        }
    }

    public void setAge(int age) {
        if (age < 0 || age > 200) {
            return;
        }
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
