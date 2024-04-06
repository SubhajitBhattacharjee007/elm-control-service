package com.elm.elmcontrolservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.elm.elmcontrolservice.dto.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    @Query("SELECT u FROM Ticket u WHERE u.status = 'Closed'")
    List<Ticket> findAllClosedTickets();

    @Query("SELECT u FROM Ticket u WHERE u.status not in ('Closed')")
    List<Ticket> findAllOpenTickets();
}
