//package regularAPI.example.regularAPI.service;
//
//import regularAPI.example.regularAPI.domain.ticket.Ticket;
//import regularAPI.example.regularAPI.repositories.TicketRepository;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//public class TicketService {
//
//    private final TicketRepository ticketRepository;
//
//    public TicketService(TicketRepository ticketRepository) {
//        this.ticketRepository = ticketRepository;
//    }
//
//    @Transactional
//    public Ticket createTicket(Ticket ticket) {
//        if (ticket.getViolation() == null) {
//            throw new IllegalArgumentException("Veículo não possui multas");
//        }
//
//        if (ticket.getViolation().getMoint() < 0) {
//            throw new IllegalArgumentException("O valor da multa não pode ser negativo.");
//        }
//
//        return ticketRepository.save(ticket);
//    }
//
////    public List<Ticket> getAllTickets() {
////    }
////
////    public Ticket getTicketById(Long id) {
////    }
////
////    public Ticket updateTicket(Long id, Ticket ticket) {
////    }
////
////    public void deleteTicket(Long id) {
////    }
//}
