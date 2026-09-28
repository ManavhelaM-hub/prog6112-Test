/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
// RunApplication  
import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select the console type:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. SWITCH");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        input.nextLine(); // clear the newline

        String consoleType;
        switch (choice) {
            case 1:  consoleType = "PS5";    break;
            case 2:  consoleType = "XBOX";   break;
            case 3:  consoleType = "SWITCH"; break;
            default: consoleType = "UNKNOWN";
        }

        System.out.print("Enter the store name: ");
        String store = input.nextLine();

        System.out.print("Enter thetotal sales: ");
        int totalSales = input.nextInt();

        ConsoleSales report = new ConsoleSales(consoleType, store, totalSales);
        report.printReport();

        input.close();
    }
}