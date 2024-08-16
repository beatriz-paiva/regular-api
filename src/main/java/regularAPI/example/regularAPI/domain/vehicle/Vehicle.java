package regularAPI.example.regularAPI.domain.vehicle;

import jakarta.persistence.*;
import regularAPI.example.regularAPI.domain.driver.Driver;

import java.util.Objects;
import java.util.UUID;

@Table(name="vehicle")
@Entity
public class Vehicle {

    @Id
    @GeneratedValue()
    private UUID id;
    private String modelo;
    private String placa;
    private String vehicle_type;
    private String renavam;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver")
    private Driver driver;

    public Vehicle(UUID id, String modelo, String placa, String vehicle_type, String renavam, Driver driver) {
        this.id = id;
        this.modelo = modelo;
        this.placa = placa;
        this.vehicle_type = vehicle_type;
        this.renavam = renavam;
        this.driver = driver;
    }

    public Vehicle(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(id, vehicle.id) && Objects.equals(modelo, vehicle.modelo) && Objects.equals(placa, vehicle.placa) && Objects.equals(vehicle_type, vehicle.vehicle_type) && Objects.equals(renavam, vehicle.renavam) && Objects.equals(driver, vehicle.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modelo, placa, vehicle_type, renavam, driver);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String type) {
        this.vehicle_type = type;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
