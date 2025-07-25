package com.travel.user;

import com.travel.booking.Ticket;

public class User extends Ticket {

    private String userName;
    private int age;
    private String  dob;
    private String gender;
    private long phoneNo;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void ticketBooking(){
        System.out.println("------------------");
        System.out.println("Your Ticket ID "+getTicketId()+"\nFare : "+getFare()+"\nAnd Your Destination as you asked "+getDestination());
        System.out.println("------------------");
    }

}
