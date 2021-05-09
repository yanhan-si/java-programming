package model;

import java.util.Date;

public class Reservation {
    Customer customer;
    Room iRoom;
    Date checkInDate;
    Date checkOutDate;

    public Reservation(Customer customer, IRoom iRoom, Date checkInDate, Date checkOutDate){
        this.customer=customer;
        this.iRoom= (Room) iRoom;
        this.checkInDate=checkInDate;
        this.checkOutDate=checkOutDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public IRoom getiRoom() {
        return iRoom;
    }

    public void setiRoom(IRoom iRoom) {
        this.iRoom = (Room) iRoom;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        return "Reservation Details: " + "Customer: " + customer.getFirstName() + " " + customer.getLastName() +
                "  Room Number: " + iRoom.getRoomNumber() + " Check in: " + checkInDate +
                " Check out:" + checkOutDate;
    }
}
