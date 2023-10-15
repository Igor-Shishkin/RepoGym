package com.train.sda.springsda.web;

import com.train.sda.springsda.entities.Guest;
import com.train.sda.springsda.repositoriy.GuestRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guests")
public class GuestController {
    private final GuestRepository guestRepository;

    public GuestController(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @GetMapping
    public String getGuests(Model model){
        model.addAttribute("guestList", guestRepository.findAll());
        return "guests";
    }
}
