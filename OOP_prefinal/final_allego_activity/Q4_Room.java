
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_pre.final_allego_activity;

/**
 *
 * @author User
 */
public class Q4_Room {

    private String roomNumber;
    private String roomType;
    private String guestName;
    private int numberOfNights;

    // Constructor
    public Q4_Room(String roomNumber, String roomType,
            String guestName, int numberOfNights) {

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.guestName = guestName;
        this.numberOfNights = numberOfNights;
    }

   
    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

   
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

   
    public double calculateBookingCost() {
        return 0.00;
    }

  
    public void displayRoomInfo() {

        System.out.println("Room Type: " + roomType);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Guest: " + guestName);
        System.out.println("Nights: " + numberOfNights);
        System.out.printf("Booking Cost: ₱%,.2f%n",
                calculateBookingCost());
        System.out.println();
    }
}