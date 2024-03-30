package com.elm.elmcontrolservice.service;

import java.util.List;

import com.elm.elmcontrolservice.dto.TicketDto;

public interface TicketService {

    List<TicketDto> getAllTickets();

    void deleteTicket(Long ticketId);

    TicketDto createTicket(TicketDto ticketDto);

    TicketDto getTicketById(Long ticketId);

    TicketDto updateTicket(Long ticketId, TicketDto ticket);

}
