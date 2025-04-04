import java.util.Comparator;

public class SpacePersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getExperience() != p2.getExperience()) {
            return -Integer.compare(p1.getExperience(), p2.getExperience());
        }

        int countS1 = countS(p1);
        int countS2 = countS(p2);
        if (countS1 != countS2) {
            return -Integer.compare(countS1, countS2);
        }

        return  Integer.compare(p1.getName().length(), p2.getName().length());
    }

    private int countS(Person p) {
        int counter = 0;
        for (char s : p.getName().toLowerCase().toCharArray()) {
            if (s == 's') {
                counter++;
            }
        }
        return counter;
    }
}
