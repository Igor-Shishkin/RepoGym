package com.train.sda.springsda.web;

import com.train.sda.springsda.entities.Guest;
import com.train.sda.springsda.entities.Room;
import com.train.sda.springsda.repositoriy.GuestRepository;
import com.train.sda.springsda.repositoriy.ReservationRepository;
import com.train.sda.springsda.repositoriy.RoomRepository;
import com.train.sda.springsda.service.ReservationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WebServiceController {

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;
    private final ReservationService reservationService;

    public WebServiceController(RoomRepository roomRepository, GuestRepository guestRepository,
                                ReservationRepository reservationRepository, ReservationService reservationService) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
        this.reservationService = reservationService;
    }


    @GetMapping("/rooms")
    public List<Room> getRooms() {
        return (List<Room>) this.roomRepository.findAll();
    }
}
