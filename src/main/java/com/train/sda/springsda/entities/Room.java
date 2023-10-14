package com.train.sda.springsda.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Entity
@Table(name = "ROOM")
public class Room {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROOM_ID")
    private long id;
    @Getter
    @Setter
    @Column(name = "NAME")
    private String name;
    @Getter
    @Setter
    @Column(name = "ROOM_NUMBER")
    private String roomNumber;
    @Getter
    @Setter
    @Column(name = "BED_INFO")
    private String bedInfo;

}

//    ROOM_ID BIGSERIAL PRIMARY KEY,
//    NAME VARCHAR(16) NOT NULL,
//    ROOM_NUMBER CHAR(2) NOT NULL UNIQUE,
//    BED_INFO CHAR(2) NOT NULL