package regularAPI.example.regularAPI.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import regularAPI.example.regularAPI.domain.ticket.DTO.TicketDTO;
import regularAPI.example.regularAPI.domain.ticket.Ticket;
import regularAPI.example.regularAPI.service.TicketService;

import java.util.UUID;
import java.util.List;

@RestController
@RequestMapping("/api/regular/ticket")
public class TicketController {

    private final TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<TicketDTO> get(@RequestParam UUID id){
        TicketDTO response = service.get(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<TicketDTO>> getAll(){
        List<TicketDTO> response = service.getAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<TicketDTO> post(Ticket obj){
        TicketDTO response = service.post(obj);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/")
    public ResponseEntity<TicketDTO> put(UUID id, TicketDTO ticketDTO){
        var response = service.put(id, ticketDTO);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
