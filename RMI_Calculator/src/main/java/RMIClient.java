/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rp332
 */
import java.rmi.Naming;

public class RMIClient {

    public static void main(String[] args) {

        try {

            Calculator calc = (Calculator)
                    Naming.lookup("rmi://localhost/CalculatorService");

            System.out.println("Addition: " + calc.add(20, 8));

            System.out.println("Subtraction: " + calc.sub(20, 8));

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}