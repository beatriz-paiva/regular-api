package regularAPI.example.regularAPI.domain.violation;

import jakarta.persistence.*;
import regularAPI.example.regularAPI.domain.violation.Enum.Factor;

import java.util.UUID;

@Table(name="violation")
@Entity
public class Violation {

    @Id
    @GeneratedValue
    private UUID id;
    private String description;
    private double moint;
    private String rating;
    @Enumerated(EnumType.STRING)
    private Factor factor;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMoint() {
        return moint;
    }

    public void setMoint(double moint) {
        this.moint = moint;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Factor getFactor() {
        return factor;
    }

    public void setFactor(Factor factor) {
        this.factor = factor;
    }
}
