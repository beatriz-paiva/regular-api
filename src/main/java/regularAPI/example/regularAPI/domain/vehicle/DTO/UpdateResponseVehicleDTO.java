package regularAPI.example.regularAPI.domain.vehicle.DTO;

import regularAPI.example.regularAPI.domain.driver.Driver;

public class UpdateResponseVehicleDTO {

    private String placa;
    private String renavam;
    private Driver driver;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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
