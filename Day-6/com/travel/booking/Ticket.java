package com.travel.booking;

public class Ticket {

    private final int ticketId = 32;
    private final int fare = 3000;
    private String destination;

    public int getTicketId() {
        return ticketId;
    }


    public int getFare() {
        return fare;
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
