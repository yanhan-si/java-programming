package service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.*;

public class ReservationService {

    private static final Map<String, IRoom> mapOfRooms = new HashMap<String, IRoom>();
    private static final Set<Reservation> reservations = new HashSet<>();


    public void addRoom(IRoom iRoom){
        mapOfRooms.put(iRoom.getRoomNumber(),iRoom);
    }

    public IRoom getARoom(String roomId){
        return mapOfRooms.get(roomId);
    }

    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){
        Reservation reservation = new Reservation(customer, room, checkInDate, checkOutDate);
        reservations.add(reservation) ;
        return reservation;
    }

    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate){
        Set<IRoom> findAvailableRooms = new HashSet<>();

        for(IRoom room : mapOfRooms.values()){
            for(Reservation reservation: reservations){
                if (room == reservation.getiRoom()) {

                    boolean flag = checkOutDate.before(reservation.getCheckInDate()) ||
                            checkInDate.after(reservation.getCheckOutDate());
                    if (!flag) {
                        break;
                    }
                }
            }
            findAvailableRooms.add(room);
        }
        System.out.println(findAvailableRooms);
        return findAvailableRooms;
    }

    public Collection<Reservation> getCustomersReservation(Customer customer){
        List<Reservation> reservationsByCustomer = new ArrayList<>();
        for(Reservation reservation : reservations){
            if(reservation.getCustomer().equals(customer)){
                reservationsByCustomer.add(reservation);
            }
        }
        return reservationsByCustomer;
    }

    public void printAllReservation(){
        for(Reservation reservation : reservations){
            System.out.println(reservation);
        }
    }
    public Collection<IRoom> allRooms() {
        return mapOfRooms.values();
    }


}
