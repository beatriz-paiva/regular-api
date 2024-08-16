package regularAPI.example.regularAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import regularAPI.example.regularAPI.domain.Violation;

import java.util.UUID;

public interface ViolationRepository extends JpaRepository<Violation, UUID> {
//    <Optional> Vehicle findByCpf(String cpf);
}
