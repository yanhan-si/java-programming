package api;

import model.Customer;
import model.IRoom;
import model.Room;
import model.RoomType;
import service.CustomerService;
import service.ReservationService;

import java.util.Collection;
import java.util.List;


public class AdminResource {
    public static final CustomerService customerService = new CustomerService();
    public static final ReservationService reservationService = new ReservationService();

    public static void createRooms(String roomNumber, double price, RoomType roomType) {
        IRoom room = new Room(roomNumber, price, roomType);
        reservationService.addRoom(room);
        System.out.println("Your Room has been Created!");
    }


    public Customer getCustomer(String email){
        return customerService.getCustomer(email);
    }

    public void addRoom(List<IRoom> rooms){
        for (IRoom room : rooms) {
            reservationService.addRoom(room);
        }
    }

    public void displayAllReservations(){
        reservationService.printAllReservation();
    }

    public Collection<IRoom> getAllRooms(){
        return reservationService.allRooms();
    }

    public Collection<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
}
