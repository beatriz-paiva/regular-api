package regularAPI.example.regularAPI.domain.driver.DTO;

import java.util.UUID;

public class DriverResponseDTO {

    public UUID id;
    public String cpf;
    public String name;
    public String renach;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRenach() {
        return renach;
    }

    public void setRenach(String renach) {
        this.renach = renach;
    }
}
