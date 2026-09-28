/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */

// Subclass ConsoleSales
public class ConsoleSales extends Consoles {

    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    } 

    public void printReport() {
        System.out.println("****************************************");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("****************************************");
        System.out.println("Console type : " + getConsoleType());
        System.out.println("Store name   : " + getStore());
        System.out.println("Total sales  : " + getTotalSales());
        System.out.println("************************************");
    }
}
  