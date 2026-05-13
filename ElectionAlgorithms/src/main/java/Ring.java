/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rp332
 */
import java.util.Scanner;

public class Ring {

    static int processes[] = {1, 2, 3, 4, 5};

    static void election(int initiator) {

        int max = initiator;

        int index = initiator - 1;

        System.out.println("Election started by Process " + initiator);

        for (int i = 0; i < processes.length; i++) {

            System.out.println("Message passed to Process " + processes[index]);

            if (processes[index] > max) {

                max = processes[index];
            }

            index = (index + 1) % processes.length;
        }

        System.out.println("Process " + max + " becomes Coordinator");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initiator process: ");

        int initiator = sc.nextInt();

        election(initiator);
    }
}