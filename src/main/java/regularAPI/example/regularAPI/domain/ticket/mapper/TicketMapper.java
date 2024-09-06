package regularAPI.example.regularAPI.domain.ticket.mapper;

import org.springframework.stereotype.Service;
import regularAPI.example.regularAPI.domain.ticket.DTO.TicketDTO;
import regularAPI.example.regularAPI.domain.ticket.DTO.TicketResponseDTO;
import regularAPI.example.regularAPI.domain.ticket.Ticket;

import java.util.Optional;

@Service
public class TicketMapper {

    public TicketResponseDTO convertToTicketResponseDTO(Ticket ticket) {

        TicketResponseDTO ticketResponseDTO = new TicketResponseDTO();
        ticketResponseDTO.setId(ticket.getId());
        ticketResponseDTO.setOccurrence_data(ticket.getOccurrence_data());
        ticketResponseDTO.setVehicle(ticket.getVehicle());
        ticketResponseDTO.setViolation(ticket.getViolation());

        return ticketResponseDTO;
    }

    public TicketDTO convertToTicketDTO(Ticket ticket) {

        TicketDTO ticketDTO = new TicketDTO();
        ticketDTO.setOccurrence_data(ticket.getOccurrence_data());
        ticketDTO.setVehicle(ticket.getVehicle());
        ticketDTO.setViolation(ticket.getViolation());

        return ticketDTO;
    }
}
