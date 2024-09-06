package regularAPI.example.regularAPI.service;

import org.springframework.stereotype.Service;
import regularAPI.example.regularAPI.domain.driver.Driver;
import regularAPI.example.regularAPI.domain.ticket.DTO.TicketDTO;
import regularAPI.example.regularAPI.domain.ticket.DTO.TicketResponseDTO;
import regularAPI.example.regularAPI.domain.ticket.Ticket;
import regularAPI.example.regularAPI.domain.ticket.mapper.TicketMapper;
import regularAPI.example.regularAPI.domain.vehicle.Vehicle;
import regularAPI.example.regularAPI.domain.violation.Violation;
import regularAPI.example.regularAPI.repositories.TicketRepository;
import regularAPI.example.regularAPI.repositories.VehicleRepository;
import regularAPI.example.regularAPI.repositories.ViolationRepository;

import java.util.List;
import java.util.UUID;

@Service
public class TicketService {

    private final TicketRepository repo;
    private final VehicleRepository vehicleRepository;
    private final ViolationRepository violationRepository;
    private final TicketMapper ticketMapper;

    public TicketService(TicketRepository repo, VehicleRepository vehicleRepository, ViolationRepository violationRepository, TicketMapper ticketMapper) {
        this.repo = repo;
        this.vehicleRepository = vehicleRepository;
        this.violationRepository = violationRepository;
        this.ticketMapper = ticketMapper;
    }

    public TicketResponseDTO get(UUID id) {
        return ticketMapper.convertToTicketResponseDTO(repo.findById(id).orElse(null));
    }

    public List<TicketResponseDTO> getAll() {
        return repo.findAll().stream().map(ticket -> ticketMapper.convertToTicketResponseDTO(ticket)).toList();
    }

    public TicketDTO post(Ticket obj){

        Ticket ticket = new Ticket();

        Vehicle vehicle = vehicleRepository.findById(obj.getVehicle().getId()).get();

        Violation violation = violationRepository.findById(obj.getViolation().getId()).get();


        if (ticket.getOccurrence_data() != null){
            ticket.setOccurrence_data(ticket.getOccurrence_data());
        }
        if (ticket.getViolation() != null){
            ticket.setViolation(violation);
        }
        if (ticket.getVehicle() != null){
            ticket.setVehicle(vehicle);
        }

        return ticketMapper.convertToTicketDTO(repo.save(ticket));

    }

    public TicketDTO put(UUID id, TicketDTO ticketDTO) {

        Ticket ticket = repo.findById(id).orElse(null);

        Vehicle vehicle = vehicleRepository.findById(ticketDTO.getVehicle().getId()).get();

        Violation violation = violationRepository.findById(ticketDTO.getViolation().getId()).get();

        if (ticket.getOccurrence_data() != null){
            ticket.setOccurrence_data(ticket.getOccurrence_data());
        }
        if (ticket.getViolation() != null){
            ticket.setViolation(violation);
        }
        if (ticket.getVehicle() != null){
            ticket.setVehicle(vehicle);
        }

        return ticketMapper.convertToTicketDTO(repo.save(ticket));
    }
}
