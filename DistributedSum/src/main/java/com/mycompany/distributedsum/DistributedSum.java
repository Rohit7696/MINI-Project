/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.distributedsum;

/**
 *
 * @author rp332
 */
import java.util.Scanner;

public class DistributedSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50, 60};

        System.out.print("Enter number of processors: ");
        int p = sc.nextInt();

        int size = arr.length / p;

        int totalSum = 0;

        for (int rank = 0; rank < p; rank++) {

            int start = rank * size;

            int end;

            if (rank == p - 1) {
                end = arr.length;
            } else {
                end = start + size;
            }

            int localSum = 0;

            System.out.println("\nProcessor ID: " + rank);

            System.out.print("Elements: ");

            for (int i = start; i < end; i++) {

                System.out.print(arr[i] + " ");

                localSum += arr[i];
            }

            System.out.println("\nLocal Sum: " + localSum);

            totalSum += localSum;
        }

        System.out.println("\nFinal Sum = " + totalSum);
    }
}
