import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        float input = keyboard.nextFloat();
        System.out.println(game(input));
    }

    public static String game(float n) {
        int hundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, two = 0;

        hundred = countNotes(n, 100);
        n -= 100 * hundred;
        fifty = countNotes(n, 50);
        n -= 50 * fifty;
        twenty = countNotes(n, 20);
        n -= 20 * twenty;
        ten = countNotes(n, 10);
        n -= 10 * ten;
        five = countNotes(n, 5);
        n -= 5 * five;
        two = countNotes(n, 2);
        n -= 2 * two;

        return "NOTAS:\n" +
                " " + hundred + " nota(s) de R$ 100.00\n" +
                " " + fifty + " nota(s) de R$ 50.00\n" +
                " " + twenty + " nota(s) de R$ 20.00\n" +
                " " + ten + " nota(s) de R$ 10.00\n" +
                " " + five + " nota(s) de R$ 5.00\n" +
                " " + two + " nota(s) de R$ 2.00";
    }

    public static int countNotes(float value, int noteValue) {
        return (int) (value / noteValue);
    }
}
