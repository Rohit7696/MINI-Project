/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rp332
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

    public CalculatorImpl() throws RemoteException {
        super();
    }

    public int add(int a, int b) throws RemoteException {

        System.out.println("Add called by: " + Thread.currentThread().getName());

        return a + b;
    }

    public int sub(int a, int b) throws RemoteException {

        System.out.println("Sub called by: " + Thread.currentThread().getName());

        return a - b;
    }
}