package regularAPI.example.regularAPI.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name="violation")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Violation {

    @Id
    @GeneratedValue
    private UUID id;

    private String description;
    private double moint;
    private String rating;
    private String factor;

}
