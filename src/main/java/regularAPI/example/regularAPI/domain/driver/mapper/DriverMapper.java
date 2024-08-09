package regularAPI.example.regularAPI.domain.driver.mapper;

import org.springframework.stereotype.Service;
import regularAPI.example.regularAPI.domain.driver.DTO.DriverRequestDTO;
import regularAPI.example.regularAPI.domain.driver.Driver;

import java.util.Optional;

@Service
public class DriverMapper {

    public DriverRequestDTO convertToDriverRequestDTO(Driver driver){
        DriverRequestDTO driverRequestDTO = new DriverRequestDTO();
        driverRequestDTO.setCpf(driver.getCpf());
        driverRequestDTO.setName(driver.getName());
        driverRequestDTO.setRenach(driver.getRenach());
        return driverRequestDTO;
    }
}
