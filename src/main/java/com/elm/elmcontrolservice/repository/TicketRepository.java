package com.elm.elmcontrolservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elm.elmcontrolservice.dto.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
