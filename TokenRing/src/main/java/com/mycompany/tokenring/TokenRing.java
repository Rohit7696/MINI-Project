
package com.mycompany.tokenring;

import java.util.Scanner;

public class TokenRing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");

        int n = sc.nextInt();

        int token = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("\nToken with Process " + token);

            System.out.print("Does Process " + token + " want to enter Critical Section? (1-Yes / 0-No): ");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Process " + token + " entering Critical Section");

                System.out.println("Process " + token + " leaving Critical Section");
            }

            token = (token + 1) % n;
        }
    }
}
