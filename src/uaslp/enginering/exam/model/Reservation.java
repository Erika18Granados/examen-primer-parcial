package uaslp.enginering.exam.model;

public class Reservation {
    private Guest invitado;
    private String date;
    private Room room;
    private int nigth;

    public Reservation(Room room) {
        this.room = room;
    }



    public Guest getGuest() {
        return invitado;
    }

    public void setGuest(Guest invitado) {
        this.invitado = invitado;
    }

    public String getArrivalDate() {
        return date;
    }

    public void setArrivalDate(String date) {
        this.date = date;
    }

    public Room getRoomNumber() {
        return room;
    }

    public void setRoomNumber(int roomNumber) {
        this.room.setRoomNumber(roomNumber);
    }

    public int getNights() {
        return nigth;
    }

    public void setNights(int nigth) {
        this.nigth = nigth;
    }


}
