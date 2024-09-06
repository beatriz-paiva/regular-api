package regularAPI.example.regularAPI.domain.ticket;

import jakarta.persistence.*;
import regularAPI.example.regularAPI.domain.vehicle.Vehicle;
import regularAPI.example.regularAPI.domain.violation.Violation;

import java.time.LocalDateTime;
import java.util.UUID;

@Table(name="ticket")
@Entity
public class Ticket {

    @Id
    @GeneratedValue()
    private UUID id;
    private LocalDateTime occurrence_data;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicle")
    private Vehicle vehicle;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "violation")
    private Violation violation;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getOccurrence_data() {
        return occurrence_data;
    }

    public void setOccurrence_data(LocalDateTime occurrence_data) {
        this.occurrence_data = occurrence_data;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Violation getViolation() {
        return violation;
    }

    public void setViolation(Violation violation) {
        this.violation = violation;
    }
}
