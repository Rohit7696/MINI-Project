/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rp332
 */
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {

    public static void main(String[] args) {

        try {

            // Create registry inside program
            LocateRegistry.createRegistry(1099);

            CalculatorImpl obj = new CalculatorImpl();

            Naming.rebind("rmi://localhost/CalculatorService", obj);

            System.out.println("Server is running...");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}