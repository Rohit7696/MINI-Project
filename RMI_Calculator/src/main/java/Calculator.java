/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author rp332
 */
//import java.rmi.Remote;
//import java.rmi.RemoteException;
//
//public interface Calculator extends Remote {
//    
//    int add(int a, int b) throws RemoteException;
//    int subtract(int a, int b) throws RemoteException;
//}

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

    int add(int a, int b) throws RemoteException;

    int sub(int a, int b) throws RemoteException;
}