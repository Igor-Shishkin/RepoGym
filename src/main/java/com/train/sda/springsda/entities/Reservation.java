package com.train.sda.springsda.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Getter
@ToString
@Entity
@Table(name = "RESERVATION")
public class Reservation {
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESERVATION_ID")
    private long reservationId;

    @Setter
    @Column(name = "ROOM_ID")
    private long roomId;

    @Setter
    @Column(name = "GUEST_ID")
    private long guestId;

    @Setter
    @Column(name = "RES_DATE")
    private Date reservationDate;


}
