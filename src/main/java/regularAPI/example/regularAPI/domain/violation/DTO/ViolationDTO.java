package regularAPI.example.regularAPI.domain.violation.DTO;

public class ViolationResponseDTO {

    private String description;
    private double moint;
    private String rating;
    private String factor;

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

    public String getFactor() {
        return factor;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }
}
