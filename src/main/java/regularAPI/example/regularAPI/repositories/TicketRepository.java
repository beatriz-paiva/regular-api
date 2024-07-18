package regularAPI.example.regularAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import regularAPI.example.regularAPI.domain.Ticket;

import java.util.Optional;
import java.util.UUID;

public interface TicketRepository extends JpaRepository<Ticket, UUID> {
//    public Optional<Ticket> findByTicketId(UUID id)
}
