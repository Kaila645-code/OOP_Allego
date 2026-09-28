/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_pre.final_allego_activity;

public class Q4_DeluxeRoom extends Q4_Room {

    public Q4_DeluxeRoom(int roomNumber, String guestName,
            int numberOfNights) {

        super(String.valueOf(roomNumber), "Deluxe",
                guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {

        return (2500.00 + 300.00) * getNumberOfNights();
    }
}