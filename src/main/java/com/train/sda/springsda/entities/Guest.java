package com.train.sda.springsda.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Entity
@Table(name = "GUEST")
public class Guest {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GUEST_ID")
    private long guestId;
    @Getter
    @Setter
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Getter
    @Setter
    @Column(name = "LAST_NAME")
    private String lastName;
    @Getter
    @Setter
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Getter
    @Setter
    @Column(name = "ADDRESS")
    private String address;
    @Getter
    @Setter
    @Column(name = "COUNTRY")
    private String country;
    @Getter
    @Setter
    @Column(name = "STATE")
    private String state;
    @Getter
    @Setter
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

}