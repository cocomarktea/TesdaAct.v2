package Challenge;

import java.util.Scanner;

public class monthDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month number(1:Jan - 12:Dec): ");
        int month = scanner.nextInt();
        switch (month) {
            case 1: // Jan
            case 3: // Mar
            case 5: // May
            case 7: // July
            case 8: // Aug
            case 10: // Oct
            case 12: // Dec
                System.out.println("Number of days: 31");
                break;
            case 4: // Apr
            case 6: // June
            case 9: // Sept
            case 11: // Nov
                System.out.println("Number of days: 30");
                break;
            case 2: // Feb
                System.out.println("Number of days: 28");
                break;
            default:
                System.out.println("Invalid month number");
        }
        scanner.close();
    }
}