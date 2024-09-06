package regularAPI.example.regularAPI.domain.violation.DTO;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import regularAPI.example.regularAPI.domain.violation.Enum.Factor;

public class ViolationDTO {

    private String description;
    private double moint;
    private String rating;
    private Factor factor;

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
