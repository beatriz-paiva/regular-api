package regularAPI.example.regularAPI.domain.ticket.mapper;

import regularAPI.example.regularAPI.domain.ticket.DTO.TicketDTO;
import regularAPI.example.regularAPI.domain.ticket.Ticket;

import java.util.Optional;

public class TicketMapper {


    public TicketDTO convertToTicketDTO(Ticket ticket) {

        TicketDTO ticketDTO = new TicketDTO();

        ticketDTO.setOccurrence_data(ticket.getOccurrence_data());
        ticketDTO.setVehicle(ticket.getVehicle());
        ticketDTO.setViolation(ticket.getViolation());

        return ticketDTO;
    }
}
