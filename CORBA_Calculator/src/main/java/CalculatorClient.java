/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rp332
 */
public class CalculatorClient
{
    public static void main(String args[])
    {
        CalculatorImpl obj = new CalculatorImpl();

        System.out.println("Addition = " + obj.add(10,5));

        System.out.println("Subtraction = " + obj.sub(10,5));
    }
}