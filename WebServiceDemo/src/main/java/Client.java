/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rp332
 */
import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 5000);

        DataOutputStream dos =
                new DataOutputStream(s.getOutputStream());

        dos.writeInt(10);

        dos.writeInt(20);

        DataInputStream dis =
                new DataInputStream(s.getInputStream());

        int result = dis.readInt();

        System.out.println("Addition Result = " + result);

        s.close();
    }
}