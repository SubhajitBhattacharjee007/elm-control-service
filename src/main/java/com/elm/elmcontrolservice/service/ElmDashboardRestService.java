package com.elm.elmcontrolservice.service;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elm.elmcontrolservice.dto.TicketDto;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public interface ElmDashboardRestService {

    @GetMapping("/dashboard")
    public String dashboard();

    @PostMapping(value = "/xyz", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createTicket(@RequestBody(required = true) TicketDto ticketDto);

}
