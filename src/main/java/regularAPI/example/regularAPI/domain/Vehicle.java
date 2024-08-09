package regularAPI.example.regularAPI.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import regularAPI.example.regularAPI.domain.driver.Driver;

import java.util.UUID;

@Table(name="vehicle")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue()
    private UUID id;
    private String modelo;
    private String placa;
    private String type;
    private String renavam;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver")
    private Driver driver;
}
