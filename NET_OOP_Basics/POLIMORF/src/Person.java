public class Person {
    String name;
    int age;

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void happyBirsday(){
        age++;
        System.out.println("С ДР person!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
