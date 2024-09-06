package regularAPI.example.regularAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import regularAPI.example.regularAPI.domain.driver.Driver;

import java.util.Optional;
import java.util.UUID;

public interface DriverRepository extends JpaRepository<Driver, UUID> {
//    @Query("SELECT * FROM driver WHERE driver.cpf = :driverCPF")
//    Optional<Driver> findByCpf(@Param("driverCPF") String cpf);

    Driver findByCpf(String cpf);

}
