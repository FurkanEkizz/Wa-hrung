import java.util.Scanner;

public class währung {

    public static void main(String[] args) {

        System.out.println("Weclhen Betrag möchten sie wechseln: ");
        Scanner scan = new Scanner(System.in);
        Double money = scan.nextDouble();

        System.out.println("Welche währung möchten sie wechseln:");
        System.out.println("1: Euro");
        System.out.println("2: Dollar");
        System.out.println("2: Lira");
        System.out.println("2: Pfund");

        Scanner scanner = new Scanner(System.in);
        int Auswahl = scanner.nextInt();

        switch (Auswahl) {

            case 1: {
                euro(money);
                break;
            }

            case 2: {
                dollar(money);
                break;
            }

            case 3: {
                Lira(money);
                break;
            }

            case 4: {
                Pfund(money);
                break;
            }

        }

    }

    public static void euro(double money) {

        System.out.println("In welche währung möchten sie umwandeln");
        System.out.println("1: Lira");
        System.out.println("2: Dollar");
        System.out.println("3: Pfund");

        Scanner scanner = new Scanner(System.in);
        int Auswahl = scanner.nextInt();

        switch (Auswahl) {

            case 1: {
                System.out.println("In Lira beträgt das:" + money * 17.33);
                break;
            }

            case 2: {
                System.out.println("In dollar beträgt das:" + money * 1.01);
                break;
            }

            case 3: {
                System.out.println("In Pfund beträgt das:" + money * 0.85);
                break;
            }

        }
    }

    public static void dollar(double money) {

        System.out.println("In welche währung möchten sie umwandeln");
        System.out.println("1: Lira");
        System.out.println("2: Euro");
        System.out.println("3: Pfund");

        Scanner scanner = new Scanner(System.in);
        int Auswahl = scanner.nextInt();

        switch (Auswahl) {

            case 1: {
                System.out.println("In Lira beträgt das:" + money * 17.45);
                break;
            }

            case 2: {
                System.out.println("In Euro beträgt das:" + money * 0.99);
                break;
            }

            case 3: {
                System.out.println("In Pfund beträgt das:" + money * 0.84);
                break;
            }

        }

    }

    public static void Lira(double money) {

        System.out.println("In welche währung möchten sie umwandeln");
        System.out.println("1: Euro");
        System.out.println("2: Dollar");
        System.out.println("3: Pfund");

        Scanner scanner = new Scanner(System.in);
        int Auswahl = scanner.nextInt();

        switch (Auswahl) {

            case 1: {
                System.out.println("In Euro beträgt das:" + money * 0.057);
                break;
            }

            case 2: {
                System.out.println("In dollar beträgt das:" + money * 0.057);
                break;
            }

            case 3: {
                System.out.println("In Pfund beträgt das:" + money * 0.048);
                break;
            }

        }
    }

    public static void Pfund(double money) {

        System.out.println("In welche währung möchten sie umwandeln");
        System.out.println("1: Lira");
        System.out.println("2: Dollar");
        System.out.println("3: Euro");

        Scanner scanner = new Scanner(System.in);
        int Auswahl = scanner.nextInt();

        switch (Auswahl) {

            case 1: {
                System.out.println("In Lira beträgt das:" + money * 20.85);
                break;
            }

            case 2: {
                System.out.println("In dollar beträgt das:" + money * 1.20);
                break;
            }

            case 3: {
                System.out.println("In Euro beträgt das:" + money * 1.18);
                break;

            }

        }
    }
}
