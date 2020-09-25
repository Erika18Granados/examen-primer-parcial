package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private ArrayList<Room> rooms;
    private int roomNumber;
    private String nameHotel;
    public Hotel(String nameHotel) {
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
        roomNumber = 0;
        this.nameHotel = nameHotel;
    }


    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        int i;
        for(i = 0; i < rooms.lastIndexOf(rooms) && roomNumber != rooms.get(i).getRoomNumber(); i++);
        Room room;
        room = new Room(rooms.get(i).getRoomNumber(),rooms.get(i).getBedType(),rooms.get(i).getRoomStatus());
        Reservation reservation = new Reservation(room);

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public String getName() {
        return nameHotel;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }


    public void addRoom(Room newRoom){
        rooms.add(newRoom);
        roomNumber++;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}
