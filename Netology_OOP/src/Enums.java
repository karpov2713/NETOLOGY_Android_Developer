public class Enums {

//    public static final int MON = 1;
//    public static final int TUE = 2;
//    public static final int WEN = 3;
//    public static final int THU = 4;
//    public static final int FRI = 5;
//    public static final int SAT = 6;
//    public static final int SUN = 7;

    public static void main(String[] args) {
        Day day = Day.SAT;
        System.out.println(isDayOff(day));
    }

    public static boolean isDayOff(Day day) {
        if (day == Day.SAT || day == Day.SUN) {
            return true;
        } else {
            return false;
        }
    }
}
