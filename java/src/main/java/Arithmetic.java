

import java.util.Scanner;

public class Arithmetic {

    public static String myScanner(String message) {
        System.out.println(String.format("%s", message));
        Scanner scanner = new Scanner(System.in);
        String newstr = scanner.nextLine();
        return newstr;
    }

    public static void calculateSrt () {
        String str = myScanner("Enter the number to sqrt:");
        Double i = Double.parseDouble(str);
        Double ans = Math.sqrt(i);
        System.out.println("The square root of "+ i + " is " + ans);
    }

    public static void calculateLog () {
        String str = myScanner("Enter the number to calculate log:");
        Double i = Double.parseDouble(str);
        Double ans = Math.log(i);
        System.out.println("The log of " + i + " is " + ans);
    }

    public static void calculateFactorial () {
        String str = myScanner("Enter the number to calculate Factorial:");
        Double fact = 1.0;
        Double i = 1.0;
        Double num = Double.parseDouble(str);
        for (i=num; i>0; i--) {
            fact = fact*i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("\nWelcome to the simple math helper \n" +
                    "What would you like to calculate?\n");
            System.out.println("1. Sqrt \n" +
                    "2. Log \n" +
                    "3. Factorial\n(Enter 'z' to exit)");
            String str = scanner.nextLine();
            if ("z".equalsIgnoreCase(str)) {
                System.out.println("Exiting");
                System.exit(0);
            } else {
                try {
                    int i = Integer.parseInt(str);
                    switch (i) {
                        case 1:
                            calculateSrt();
                            break;
                        case 2:
                            calculateLog();
                            break;
                        case 3:
                            calculateFactorial();
                            break;
                        default:
                            System.out.println("The option you selected is unknown");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("We did not recognize the option you selected");
                }
            }
        }

    }
}