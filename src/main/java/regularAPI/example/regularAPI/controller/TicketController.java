//package regularAPI.example.regularAPI.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import regularAPI.example.regularAPI.domain.Ticket;
//import regularAPI.example.regularAPI.services.TicketService;
//
//import javax.inject.Inject;
//import java.util.List;
//
//// Other imports
//
//@RestController
//@RequestMapping("/tickets")
//public class TicketController {
//
//    @Inject
//    private TicketService ticketService;
//
//    @PostMapping("/save")
//    public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket) {
//        Ticket createdTicket = ticketService.createTicket(ticket);
//        return new ResponseEntity<>(createdTicket, HttpStatus.CREATED);
//    }
//
//}
//
//
