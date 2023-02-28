package Oops;

public class StduentsMain {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudents s = new LPAStudents(98435 + i, switch (i) {
                case 1 -> "mary";
                case 2 -> "dhruv";
                case 3 -> "harry";
                case 4 -> "lary";
                case 5 -> "shyam";
                default -> "anoumous";
            }, "05/08/2001", "JAVA MASTERCLASS");
            System.out.println(s);
        }
    }
}
