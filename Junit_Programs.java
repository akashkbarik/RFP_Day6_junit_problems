import java.util.Scanner;

public class Junit_Programs {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        vending machine call
        vending_machine.notes();
//        weekday call
        System.out.println("day is " + weekDay() + "th day of week");
    }
    public static class vending_machine {
        static int n, total;
        static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};

        static void notes() {
            System.out.println("enter the amount");
            int value = sc.nextInt();
            for (n = 0; n < notes.length; n++) {
                while (value >= notes[n]) {
                    total = value / notes[n];
                    System.out.println(notes[n] + " rs notes : " + total);
                    value = value % notes[n];
                }
                if (value == 0) {
                    System.out.println("total notes needed is : " + total);
                }
            }
        }
    }

    //    weekday code
    public static int weekDay() {
        System.out.println("this is weekday code\n.........................");

        System.out.println("enter day month year respectively : ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;

    }
}