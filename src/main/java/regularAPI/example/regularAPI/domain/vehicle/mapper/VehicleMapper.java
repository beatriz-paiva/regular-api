package regularAPI.example.regularAPI.domain.vehicle.mapper;

import org.springframework.stereotype.Service;
import regularAPI.example.regularAPI.domain.driver.DTO.DriverRequestDTO;
import regularAPI.example.regularAPI.domain.vehicle.DTO.VehicleResponseDTO;
import regularAPI.example.regularAPI.domain.vehicle.Vehicle;

@Service
public class VehicleMapper {
    public VehicleResponseDTO convertToVehicleResponseDTO(Vehicle vehicle){
        VehicleResponseDTO vehicleResponseDTO = new VehicleResponseDTO();
        vehicleResponseDTO.setModelo(vehicle.getModelo());
        vehicleResponseDTO.setPlaca(vehicle.getPlaca());
        vehicleResponseDTO.setVehicle_type(vehicle.getVehicle_type());
        vehicleResponseDTO.setRenavam(vehicle.getRenavam());
        vehicleResponseDTO.setDriver(vehicle.getDriver());

        return vehicleResponseDTO;
    }
}
