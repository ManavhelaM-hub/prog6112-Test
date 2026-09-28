/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingreport;

/**
 *
 * @author Student
 */
public class GamingReport {
    public static void main(String[] args) {

        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        int[][] sales = {
            {1000, 2000, 3000},   // Cape Town
            {2000, 3000, 4000},   // Port Elizabeth
            {1500, 1100, 1200}    // Pretoria
        };

        int[] totals = new int[cities.length];

        // Calculate total sales per city
        for (int k = 0; k < cities.length; k++) {
            for (int m = 0; m < consoles.length; m++) {
                totals[m] += sales[k][m];
            }
        }

        // Find city with the most sales
        int maxIndex = 0;
        for (int k = 1; k < totals.length; k++) {
            if (totals[k] > totals[maxIndex]) {
                maxIndex = k;
            }
        }

        String line = "-".repeat(60);

        // Header
        System.out.println(line);
        System.out.println("GAMING REPORT");
        System.out.println(line);

        // Column headings
        System.out.printf("%-20s", "");
        for (String console : consoles) {
            System.out.printf("%-10s", console);
        }
        System.out.println();

        // City sales rows
        for (int k = 0; k < cities.length; k++) {
            System.out.printf("%-20s", cities[k]);
            for (int m = 0; m < consoles.length; m++) {
                System.out.printf("%-10d", sales[k][m]);
            }
            System.out.println();
        }

        // Totals 
        System.out.println(line);
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println(line);

        for (int k = 0; k < cities.length; k++) {
            System.out.printf("%-20s%d%n", cities[k], totals[k]);
        }

        // City with the most sales
        System.out.println(line);
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);
        System.out.println(line);
    }
}