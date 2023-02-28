import java.util.Scanner;

public class Junit_Programs {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        vending_machine.notes();
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
}