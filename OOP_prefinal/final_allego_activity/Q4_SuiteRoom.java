/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this template
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_pre.final_allego_activity;

public class Q4_SuiteRoom extends Q4_Room {

    public Q4_SuiteRoom(int roomNumber, String guestName,
            int numberOfNights) {

        super(String.valueOf(roomNumber), "Suite",
                guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {

        return (4000.00 * getNumberOfNights()) + 1000.00;
    }
}