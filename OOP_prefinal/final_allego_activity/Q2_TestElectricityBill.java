/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_pre.final_allego_activity;


/**
 *
 * @author User
 */
public class Q2_TestElectricityBill {

    public static void main(String[] args) {

        Q2_ElectricityBill bill1 = new Q2_ElectricityBill(
                "EL-1001",
                "Juan Santos",
                "Residential",
                1250,
                1475
        );

        bill1.displayBill();

    }
}
