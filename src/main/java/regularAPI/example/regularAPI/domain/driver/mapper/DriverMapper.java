package regularAPI.example.regularAPI.domain.driver.mapper;

import org.springframework.stereotype.Service;
import regularAPI.example.regularAPI.domain.driver.DTO.DriverRequestDTO;
import regularAPI.example.regularAPI.domain.driver.DTO.DriverResponseDTO;
import regularAPI.example.regularAPI.domain.driver.Driver;

@Service
public class DriverMapper {

    public DriverResponseDTO convertToDriverResponseDTO(Driver driver){
        DriverResponseDTO driverResponseDTO = new DriverResponseDTO();
        driverResponseDTO.setId(driver.getId());
        driverResponseDTO.setCpf(driver.getCpf());
        driverResponseDTO.setName(driver.getName());
        driverResponseDTO.setRenach(driver.getRenach());
        return driverResponseDTO;
    }

    public DriverRequestDTO convertToDriverRequestDTO(Driver driver){
        DriverRequestDTO driverResquestDTO = new DriverRequestDTO();
        driverResquestDTO.setName(driver.getName());
        driverResquestDTO.setRenach(driver.getRenach());
        return driverResquestDTO;
    }

}
