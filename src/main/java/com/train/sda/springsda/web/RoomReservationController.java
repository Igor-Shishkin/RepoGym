package com.train.sda.springsda.web;

import com.train.sda.springsda.entities.RoomReservation;
import com.train.sda.springsda.service.ReservationService;
import com.train.sda.springsda.util.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/reservations")
public class RoomReservationController {
    private final DateUtil dateUtil;
    private final ReservationService reservationService;

    public RoomReservationController(DateUtil dateUtil, ReservationService reservationService) {
        this.dateUtil = dateUtil;
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getReservations(@RequestParam(value = "date", required = false)String dataString, Model model){
        Date date = this.dateUtil.createDateFromString(dataString);
        List<RoomReservation> roomReservationsForDate = this.reservationService.getRoomReservationsForDate(date);
        model.addAttribute("roomReservations", roomReservationsForDate);
        return "roomres";
    }
        
}
