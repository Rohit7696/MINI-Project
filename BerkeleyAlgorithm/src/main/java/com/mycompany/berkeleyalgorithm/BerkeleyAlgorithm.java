/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.berkeleyalgorithm;

/**
 *
 * @author rp332
 */
import java.util.Scanner;

public class BerkeleyAlgorithm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");

        int n = sc.nextInt();

        int clocks[] = new int[n];

        int total = 0;

        // Input clock times
        for (int i = 0; i < n; i++) {

            System.out.print("Enter time for Node " + (i + 1) + ": ");

            clocks[i] = sc.nextInt();

            total += clocks[i];
        }

        // Display initial clocks
        System.out.println("\nInitial Clock Times:");

        for (int i = 0; i < n; i++) {

            System.out.println("Node " + (i + 1) + ": " + clocks[i]);
        }

        // Calculate average
        double average = (double) total / n;

        System.out.println("\nAverage Time: " + average);

        // Display adjustments
        System.out.println("\nClock Adjustments:");

        for (int i = 0; i < n; i++) {

            double offset = average - clocks[i];

            System.out.println("Node " + (i + 1)
                    + " needs adjustment of " + offset);
        }

        // Synchronize clocks
        System.out.println("\nSynchronized Clock Times:");

        for (int i = 0; i < n; i++) {

            System.out.println("Node " + (i + 1)
                    + ": " + average);
        }
    }
}