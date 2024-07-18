package regularAPI.example.regularAPI.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name="owner")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Owner {
    @Id
    @GeneratedValue()
    private UUID id;
    private String cpf;
    private String name;
    private String renach;


}
