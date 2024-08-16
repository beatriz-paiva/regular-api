package regularAPI.example.regularAPI.domain.driver;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Table(name="driver")
@Entity
public class Driver {
    @Id
    @GeneratedValue()
    private UUID id;
    private String cpf;
    private String name;
    private String renach;

    public Driver(UUID id, String cpf, String name, String renach) {
        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.renach = renach;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(id, driver.id) && Objects.equals(cpf, driver.cpf) && Objects.equals(name, driver.name) && Objects.equals(renach, driver.renach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpf, name, renach);
    }

    public Driver() {
    }

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
