package com.train.sda.springsda.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter
@Setter
public class RoomReservation {
    private long roomID;
    private long guestId;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastName;
    private Date date;


    /*
    roomID
    guestId
    roomName
    firstName
    lastName
    date
     */
}
