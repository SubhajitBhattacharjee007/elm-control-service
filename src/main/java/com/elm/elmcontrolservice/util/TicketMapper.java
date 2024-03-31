package com.elm.elmcontrolservice.util;

import com.elm.elmcontrolservice.dto.Ticket;
import com.elm.elmcontrolservice.dto.TicketDto;

public class TicketMapper {

    // convert ticket jpa entity into ticket dto
    public static TicketDto toTicketDto(Ticket ticket) {
        return new TicketDto(ticket.getId(), ticket.getProjectName(), ticket.getIssueType(), ticket.getStatus(),
                ticket.getAcceptanceCriteria(), ticket.getPriority(), ticket.getDescription(), ticket.getSummary());
    }

    // convert ticket dto jpa entity into ticket
    public static Ticket toTicket(TicketDto ticketDto) {
        return new Ticket(ticketDto.getId(), ticketDto.getProjectName(), ticketDto.getIssueType(),
                ticketDto.getStatus(),
                ticketDto.getAcceptanceCriteria(),
                ticketDto.getPriority(), ticketDto.getDescription(), ticketDto.getSummary());
    }

}
