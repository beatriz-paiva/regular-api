package regularAPI.example.regularAPI.domain.ticket.DTO;

import regularAPI.example.regularAPI.domain.vehicle.Vehicle;
import regularAPI.example.regularAPI.domain.violation.Violation;

import java.time.LocalDateTime;

public class TicketDTO {

    private LocalDateTime occurrence_data;
    private Vehicle vehicle;
    private Violation violation;

    public LocalDateTime getOccurrence_data() {
        return occurrence_data;
    }

    public void setOccurrence_data(LocalDateTime occurrence_data) {
        this.occurrence_data = occurrence_data;
    }

    public Violation getViolation() {
        return violation;
    }

    public void setViolation(Violation violation) {
        this.violation = violation;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
