package com.train.sda.springsda.service;

import com.train.sda.springsda.entities.Guest;
import com.train.sda.springsda.entities.Reservation;
import com.train.sda.springsda.entities.Room;
import com.train.sda.springsda.entities.RoomReservation;
import com.train.sda.springsda.repositoriy.GuestRepository;
import com.train.sda.springsda.repositoriy.ReservationRepository;
import com.train.sda.springsda.repositoriy.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Service
public class ReservationService {
    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }


    public List<RoomReservation> getRoomReservationsForDate(Date date) {
        List<RoomReservation> roomReservations = new ArrayList<>();

        Iterable<Room> rooms = this.roomRepository.findAll();
        for (Room room : rooms) {
            RoomReservation roomReservation = new RoomReservation();
            roomReservation.setRoomID(room.getId());
            roomReservation.setRoomName(room.getName());
            roomReservation.setRoomNumber(room.getRoomNumber());

            Iterable<Reservation> reservations = this.reservationRepository.
                    findReservationByRoomIdAndReservationDate(room.getId(), new java.sql.Date(date.getTime()));
            for (Reservation reservation : reservations) {
                roomReservation.setDate(date);
                Guest guest = this.guestRepository.findById(reservation.getGuestId()).orElse(null);

                if (guest != null) {
                    roomReservation.setFirstName(guest.getFirstName());
                    roomReservation.setLastName(guest.getLastName());
                    roomReservation.setGuestId(guest.getGuestId());
                }
                roomReservations.add(roomReservation);
            }
        }
        roomReservations.sort(Comparator.comparing(RoomReservation::getRoomName)
                .thenComparing(RoomReservation::getRoomNumber));
        return roomReservations;
    }


}
