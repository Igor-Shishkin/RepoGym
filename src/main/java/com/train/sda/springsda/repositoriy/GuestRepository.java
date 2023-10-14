package com.train.sda.springsda.repositoriy;

import com.train.sda.springsda.entities.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * *@Component - najbardziej ogólny, może byc wykorzystywany dla beenów będących mapperami, konwerterami
 * *@Repository - wszystko to gdzie składujemy dane
 * *@Service - logika serwisowa, wykonywanie działań np: kup kawę
 * *@Controller / @RestController - warstwa prezentująca dane / API aplikacji
 */

@Repository
@Service
public interface GuestRepository extends JpaRepository<Guest, Long> {
}
