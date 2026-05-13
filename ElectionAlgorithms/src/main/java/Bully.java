/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rp332
 */
import java.util.Scanner;

public class Bully {

    static int processes[] = {1, 2, 3, 4, 5};

    static int coordinator;

    static void election(int initiator) {

        System.out.println("Process " + initiator + " starts election");

        coordinator = initiator;

        for (int p : processes) {

            if (p > initiator) {

                System.out.println("Election message sent to Process " + p);

                coordinator = p;
            }
        }

        System.out.println("Process " + coordinator + " becomes Coordinator");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initiator process: ");

        int initiator = sc.nextInt();

        election(initiator);
    }
}
