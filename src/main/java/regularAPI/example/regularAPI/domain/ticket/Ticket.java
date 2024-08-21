package regularAPI.example.regularAPI.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import regularAPI.example.regularAPI.domain.vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.UUID;

@Table(name="ticket")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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



}
