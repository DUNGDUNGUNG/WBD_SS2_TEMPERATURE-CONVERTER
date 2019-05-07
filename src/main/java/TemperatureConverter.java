import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fTC(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + cTF(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (true);


    }

    private static double cTF(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    private static double fTC(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
