package com.elm.elmcontrolservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.elm.elmcontrolservice.dto.TicketDto;
import com.elm.elmcontrolservice.service.ElmDashboardRestService;
import com.elm.elmcontrolservice.service.TicketService;

@RestController
public class ElmDashboardRestController implements ElmDashboardRestService {

    @Autowired
    private TicketService ticketService;

    @Override
    public ResponseEntity<String> createTicket(TicketDto ticketDto) {
        System.out.println(ticketDto.getProjectName());
        TicketDto ticket = ticketService.createTicket(ticketDto);
        return new ResponseEntity<>(ticket.getId().toString(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<TicketDto>> getAllTickets() {
        List<TicketDto> tickets = ticketService.getAllTickets();
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<TicketDto>> getAllClosedTickets() {
        List<TicketDto> tickets = ticketService.getAllClosedTickets();
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

}
