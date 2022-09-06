import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
abstract class PassengerTicket {
    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public boolean isSeatAvailable() {
        return seatAvailable;
    }

    public void setSeatAvailable(boolean seatAvailable) {
        this.seatAvailable = seatAvailable;
    }

    public String getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(String seatStatus) {
        this.seatStatus = seatStatus;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerGender() {
        return passengerGender;
    }

    public void setPassengerGender(String passengerGender) {
        this.passengerGender = passengerGender;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getIssueDateTime() {
        return issueDateTime;
    }

    public void setIssueDateTime(String issueDateTime) {
        this.issueDateTime = issueDateTime;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public abstract void setTotalPrice(double totalPrice);

    public String toString()
    {
        return this.passengerName+this.passengerGender;
    }

    PassengerTicket() {
        this.seatNo = 0;
        this.seatAvailable = true;
        this.seatStatus = "vacant";
        this.passengerName = "Jon Doe";
        this.passengerGender = "Male";
        this.departure = "";
        this.destination = "";
        this.departureDateTime = "yyyy/mm/dd HH:mm:ss";
        this.issueDateTime = "yyyy/mm/dd HH:mm:ss";
        this.totalPrice = 0.0;
    }

    int seatNo;
    boolean seatAvailable;
    String seatStatus;
    String passengerName;
    String passengerGender;
    String departure;
    String destination;
    String departureDateTime;
    String issueDateTime;
    double totalPrice;
}

class BusTicket extends PassengerTicket
{
    int distance;
    double serviceCharge;
    BusTicket(int distance, double serviceCharge, double price )
    {
        super();
        this.distance = distance;
        this.serviceCharge = serviceCharge;
        setTotalPrice(price);
    }
    @Override
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = this.distance*0.08+serviceCharge;
    }
}

interface TicketOperations
{
    public boolean makeReservation(BusTicket ticket, String name, String gender);
    public boolean cancelReservation(BusTicket ticket);
    public boolean buyTicket(BusTicket ticket, String name, String gender);
    public boolean cancelTicket(BusTicket ticket);
}

class Officer implements TicketOperations
{
    String name;
    String address;
    Officer(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    Officer()
    {
        this.name = "Jon Doe";
        this.address = "No Address";
    }
    @Override
    public boolean makeReservation(BusTicket ticket, String name, String gender) {
        ticket.setPassengerName(name);
        ticket.setPassengerGender(gender);
        ticket.setSeatAvailable(false);
        ticket.setSeatStatus("RESERVED");
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String dt = df.format(date);
        ticket.setIssueDateTime(dt);
        return true;
    }

    @Override
    public boolean cancelReservation(BusTicket ticket) {
        ticket.setSeatAvailable(true);
        ticket.setSeatStatus("AVAILABLE");
        ticket.setPassengerName("");
        ticket.setPassengerGender("");
        return true;
    }

    @Override
    public boolean buyTicket(BusTicket ticket, String name, String gender) {
        ticket.setPassengerName(name);
        ticket.setSeatAvailable(false);
        ticket.setSeatStatus("SOLD");
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String dt = df.format(date);
        ticket.setIssueDateTime(dt);
        return true;
    }

    @Override

    public boolean cancelTicket(BusTicket ticket) {
        ticket.setSeatAvailable(true);
        ticket.setSeatStatus("AVAILABLE");
        ticket.setPassengerName("");
        ticket.setPassengerGender("");
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String dt = df.format(date);
        ticket.setIssueDateTime(dt);
        return true;
    }
}




