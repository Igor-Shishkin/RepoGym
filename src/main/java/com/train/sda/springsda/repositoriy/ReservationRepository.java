package com.train.sda.springsda.repositoriy;

import com.train.sda.springsda.entities.Guest;
import com.train.sda.springsda.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * *@Component - najbardziej ogólny, może byc wykorzystywany dla beenów będących mapperami, konwerterami
 * *@Repository - wszystko to gdzie składujemy dane
 * *@Service - logika serwisowa, wykonywanie działań np: kup kawę
 * *@Controller / @RestController - warstwa prezentująca dane / API aplikacji
 */

@Repository
@Service
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);

    Iterable<Reservation> findReservationByRoomIdAndReservationDate(long roomID, java.sql.Date date);
}
