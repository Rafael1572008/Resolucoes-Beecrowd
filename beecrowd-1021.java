import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        float n = keyboard.nextFloat();

        System.out.println(game(n));
    }
    public static String game(float n){
    int hundred = 0, fifty = 0, twety = 0, ten = 0, five = 0, one = 0;

        hundred = hundred(n);
        n -= 100 * hundred;
        fifty = fifty(n);
        n -= 50 * fifty;
        twety = twety(n);
        n -= 20 * twety;
        ten = ten(n);
        n -= 10 * ten;
        five = five(n);
        n =- 5 * five;
        one = one(n);
        n =- one;

        return "NOTAS:\n" +
                " "+ hundred + " nota(s) de R$ 100.00\n" +
                " " + fifty + " nota(s) de R$ 50.00\n" +
                " " + twety + " nota(s) de R$ 20.00\n" +
                " " + ten + " nota(s) de R$ 10.00\n" +
                " " + five + " nota(s) de R$ 5.00\n" +
                " " + one + " nota(s) de R$ 2.00";
    }
public static int hundred(float n){
    int hundred = 0;

    while (n >= 100){
        n -= 100;
        hundred += 1;
    }
    return hundred;
}
public static int fifty(float n){
        int fifty = 0;

        while (n >= 50){
            n -= 50;
            fifty += 1;
        }
        return fifty;
    }
public static int twety(float n){
        int twety = 0;

        while (n >= 20){
            n -= 20;
            twety += 1;
        }
        return twety;
}
public static int ten(float n){
        int ten = 0;

        while (n >= 10){
            n -= 10;
            ten += 1;
        }
        return ten;
    }
public static int five(float n){
        int five = 0;

        while (n >= 5){
            n -= 5;
            five += 1;
        }
        return five;
    }
public static int one(float n){
        int one = 0;

        while (n >= 1){
            n -= 1;
            one += 1;
        }
        return one;
    }
}
