package com.elm.elmcontrolservice.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elm.elmcontrolservice.dto.Ticket;
import com.elm.elmcontrolservice.dto.TicketDto;
import com.elm.elmcontrolservice.repository.TicketRepository;
import com.elm.elmcontrolservice.util.TicketMapper;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<TicketDto> getAllTickets() {
        List<Ticket> tickets = ticketRepository.findAllOpenTickets();
        return tickets.stream().map(ticket -> TicketMapper.toTicketDto(ticket)).collect(Collectors.toList());
    }

    @Override
    public void deleteTicket(Long ticketId) {
        ticketRepository.deleteById(ticketId);
    }

    @Override
    public TicketDto createTicket(TicketDto ticketDto) {
        Ticket ticket = TicketMapper.toTicket(ticketDto);
        Ticket savedTicket = ticketRepository.save(ticket);
        return TicketMapper.toTicketDto(savedTicket);
    }

    @Override
    public TicketDto getTicketById(Long ticketId) {
        Optional<Ticket> ticket = ticketRepository.findById(ticketId);
        return TicketMapper.toTicketDto(ticket.get());
    }

    @Override
    public TicketDto updateTicket(TicketDto updatedticket) {
        Optional<Ticket> ticket = ticketRepository.findById(updatedticket.getId());
        ticket.get().setAcceptanceCriteria(updatedticket.getAcceptanceCriteria());
        ticket.get().setProjectName(updatedticket.getProjectName());
        ticket.get().setDescription(updatedticket.getDescription());
        ticket.get().setIssueType(updatedticket.getIssueType());
        ticket.get().setPriority(updatedticket.getPriority());
        ticket.get().setSummary(updatedticket.getSummary());
        ticket.get().setStatus(updatedticket.getStatus());
        Ticket savedTicket = ticketRepository.save(ticket.get());
        return TicketMapper.toTicketDto(savedTicket);
    }

    @Override
    public List<TicketDto> getAllClosedTickets() {
        List<Ticket> tickets = ticketRepository.findAllClosedTickets();
        return tickets.stream().map(ticket -> TicketMapper.toTicketDto(ticket)).collect(Collectors.toList());
    }

    @Override
    public List<TicketDto> getAllOpenTickets() {
        List<Ticket> tickets = ticketRepository.findAllOpenTickets();
        return tickets.stream().map(ticket -> TicketMapper.toTicketDto(ticket)).collect(Collectors.toList());
    }

}
