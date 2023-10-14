package com.train.sda.springsda.util;

import com.train.sda.springsda.entities.Guest;
import com.train.sda.springsda.entities.Reservation;
import com.train.sda.springsda.entities.Room;
import com.train.sda.springsda.entities.RoomReservation;
import com.train.sda.springsda.repositoriy.GuestRepository;
import com.train.sda.springsda.repositoriy.ReservationRepository;
import com.train.sda.springsda.repositoriy.RoomRepository;
import com.train.sda.springsda.service.ReservationService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;
    private final DateUtil dateUtil;
    private final ReservationService reservationService;


    public AppStartupEvent(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository, DateUtil dateUtil, ReservationService reservationService) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
        this.dateUtil = dateUtil;
        this.reservationService = reservationService;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        //Pobieranie elementów z bazy danych i prezentacja na ekranie
        Iterable<Room> rooms = this.roomRepository.findAll();
        System.out.println("Rooms: ");
        rooms.forEach(System.out::println);

        // Pobieranie elementów z bazy dla Guest
        System.out.println("Guests: ");
        for (Guest guest : this.guestRepository.findAll()) {
            System.out.println(guest);
        }

        System.out.println("Reservations: ");
        // Pobieranie elementów z bazy dla Reservation
        for (Reservation reservation : this.reservationRepository.findAll()) {
            System.out.println(reservation);
        }

        System.out.println();
        System.out.println();
        System.out.println("Reservation by date: ");
        Date date = this.dateUtil.createDateFromString("2022-01-01");
        List<RoomReservation> roomReservationsForDate = this.reservationService.getRoomReservationsForDate(date);
        roomReservationsForDate.forEach(System.out::println);
    }
}
