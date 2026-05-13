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

public class Server {

    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(5000);

        System.out.println("Server Started...");

        Socket s = ss.accept();

        System.out.println("Client Connected");

        DataInputStream dis =
                new DataInputStream(s.getInputStream());

        int a = dis.readInt();

        int b = dis.readInt();

        int sum = a + b;

        DataOutputStream dos =
                new DataOutputStream(s.getOutputStream());

        dos.writeInt(sum);

        System.out.println("Addition Performed");

        ss.close();
    }
}