import java.util.Objects;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0 || age > 200){
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void happyBirthday(){
        age++;
        System.out.println("Happy birthday!");
    }

    public boolean isTooYoung() {
        if (age < 18) {
            return true;
        } else {
            return false;
        }
    }

}
