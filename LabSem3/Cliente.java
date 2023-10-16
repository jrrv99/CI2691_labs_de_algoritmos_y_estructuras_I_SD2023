import java.util.Scanner;
import java.io.IOException;

public class Cliente {
    public static Scanner scanner;

    public Cliente() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        int opt = -1;

        clear();

        Cliente cliente = new Cliente();

        do {
            printMainMenu();

            opt = readOption();

            clear();

            switch (opt)
            {
                case 0: //Salir
                    pause("Godbye! \nPress ENTER to leave!");
                    break;
                case 1:
                    areaPerimetroCirculo();
                    break;
                case 2:
                    minimoDeCuatro();
                    break;
                case 3:
                    esAnioBisiesto();
                    break;
                case 4:
                    esNumeroPrimo();
                    break;
                case 5:
                    sonNumerosCoprimos();
                    break;
                default:
                    pause("Enter a valid option! -.-' \nPress ENTER to try again!");
                    break;
            }

            clear();
        }
        while (opt != 0);

    }

    public static void printMainMenu() {
        System.out.println("**** Test your stuff  **** \n");
        System.out.println("\t1.- AreaPerimetroCirculo.");
        System.out.println("\t2.- MinimoDeCuatro.");
        System.out.println("\t3.- EsAnioBisiesto.");
        System.out.println("\t4.- EsNumeroPrimo.");
        System.out.println("\t5.- SonNumerosCoprimos.");
        System.out.println("\t0.- Exit.\n");
        System.out.print("Enter an option: ");
    }

    public static int readOption() {
        int opt = scanner.nextInt();
        scanner.nextLine();
        return opt;
    }

    public static void areaPerimetroCirculo() {
        String input;
        System.out.println("Enter the radius or exit to return to the main menu.\n");
        do {
            System.out.print("radius: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) break;

            try {
                int radius = Integer.parseInt(input);
                AreaPerimetroCirculo.areaPerimetroCirculo(radius);
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number or exit!");
            }
        }
        while (!input.equalsIgnoreCase("exit"));
    }

    public static void minimoDeCuatro() {
        String input;
        System.out.println("Enter 4 numbers separated by space or exit to get back to main menu.\n");
        do {
            System.out.print("Numbers: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) break;

            String[] nums = input.split(" ");
            if (nums.length != 4) {
                System.out.println("You must enter exactly four numbers separated by spaces.");
                continue;
            }

            try {
                int num1 = Integer.parseInt(nums[0]);
                int num2 = Integer.parseInt(nums[1]);
                int num3 = Integer.parseInt(nums[2]);
                int num4 = Integer.parseInt(nums[3]);
                
                MinimoDeCuatro.minimoDeCuatro(num1, num2, num3, num4);
            } catch (NumberFormatException e) {
                System.out.println("You must enter valid numbers or exit!");
            }
        }
        while (!input.equalsIgnoreCase("exit"));
    }

    public static void esAnioBisiesto() {
        String input;
        System.out.println("Enter the year or exit to return to the main menu.\n");
        do {
            System.out.print("year: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) break;

            try {
                int year = Integer.parseInt(input);
                EsAnioBisiesto.esAnioBisiesto(year);
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid year or exit!");
            }
        }
        while (!input.equalsIgnoreCase("exit"));
    }

    public static void esNumeroPrimo() {
        String input;
        System.out.println("Enter a number or exit to return to the main menu.\n");
        do {
            System.out.print("number: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) break;

            try {
                int number = Integer.parseInt(input);
                EsNumeroPrimo.esNumeroPrimo(number);
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number or exit!");
            }
        }
        while (!input.equalsIgnoreCase("exit"));
    }

    public static void sonNumerosCoprimos() {
        String input;
        System.out.println("Enter 2 numbers separated by space or exit to get back to main menu.\n");
        do {
            System.out.print("Numbers: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) break;

            String[] nums = input.split(" ");
            if (nums.length != 2) {
                System.out.println("You must enter exactly two numbers separated by spaces.");
                continue;
            }

            try {
                int num1 = Integer.parseInt(nums[0]);
                int num2 = Integer.parseInt(nums[1]);
                
                SonNumerosCoprimos.sonNumerosCoprimos(num1, num2);
            } catch (NumberFormatException e) {
                System.out.println("You must enter valid numbers or exit!");
            }
        }
        while (!input.equalsIgnoreCase("exit"));
    }

    public static void pause(String message) {
        System.out.println(message);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
