package com.train.sda.springsda.webService;

import com.train.sda.springsda.entities.Guest;
import com.train.sda.springsda.entities.Room;
import com.train.sda.springsda.entities.RoomReservation;
import com.train.sda.springsda.service.ReservationService;
import com.train.sda.springsda.util.DateUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;



/*
rest - soup?
 */
/**
 * 6 reguł dla REST
 * 1. Jednolity interfejs - jedno źródło dla danych
 * 2. Klient - Server - klient zna tylko adres zasobu który pozwala na interakcję z serwerem
 * 3. Bezstanowość - każde zadanie klienta musi zawierać wszystkie informacje do jego realizacji, serwer nie przechowuje informacji po otrzymaniu zapytania
 * 4. Buforowanie - odpowiedzi na żadania jeśli jest prawdopodobieństwo ponownego zapytania o ten sam zasób powinny być przechowywane w pamięci lokalnej lub w szybko dostępnej części aplikacji np moduł cash
 * 5. Warstwowa architektura systemu - klient nie ma świadomości czy odpowiedz na żadanie jest bezpośrednio z serwera czy może z jakiegoś elementu pośredniego jak CASH
 * 6. Kod na żadanie - wysyłanie na komputer klienta obiektu Java lub kodu Javascript, którzy jest uruchamiany na komputerze klienta
 */
@RestController
@RequestMapping("/api")
public class WebServiceController {
    private final ReservationService reservationService;
    private final DateUtil dateUtil;

    public WebServiceController(ReservationService reservationService, DateUtil dateUtil) {
        this.reservationService = reservationService;
        this.dateUtil = dateUtil;
    }

    @GetMapping("/guests")
    public List<Guest> getGuests(){
        return this.reservationService.getHotelGuests();
    }
    @PostMapping("/guests")
    @ResponseStatus(HttpStatus.CREATED)
    public void addGuests(@RequestBody Guest guest){
        this.reservationService.addGuest(guest);
    }
    @DeleteMapping(path = "/guests/{guestID}")
    @ResponseStatus(HttpStatus.NO_CONTENT) //fixme: zabezpieczenie przed próbą usunieńcia użytkownika którego nie ma
    public void deleteGuest(@PathVariable Long guestID){
        this.reservationService.deleteGuest(guestID);
    }


    @GetMapping("/rooms")
    public List<Room> getRooms(){
        return this.reservationService.getRooms();
    }

//    @RequestMapping(path = "/reservations?data", method = RequestMethod.GET)
//    public List<RoomReservation> getReservations(@RequestParam(value = "data", required = false)String dateString){
//       Date date = this.dateUtil.createDateFromString(dateString);
//       return this.reservationService.getRoomReservationsForDate(date);
//    }

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<RoomReservation> getReservations(@RequestParam(value = "date", required = false)String dateString){
        Date date = this.dateUtil.createDateFromString(dateString);
        return this.reservationService.getRoomReservationsForDate(date);
    }
}
