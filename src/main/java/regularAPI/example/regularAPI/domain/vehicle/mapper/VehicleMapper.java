package regularAPI.example.regularAPI.domain.vehicle.mapper;

import org.springframework.stereotype.Service;
import regularAPI.example.regularAPI.domain.vehicle.DTO.CreateVehicleDTO;
import regularAPI.example.regularAPI.domain.vehicle.DTO.UpdateResponseVehicleDTO;
import regularAPI.example.regularAPI.domain.vehicle.DTO.UpdateVehicleDTO;
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

    public CreateVehicleDTO convertToCreateVehicleDTO(Vehicle vehicle){
        CreateVehicleDTO createVehicleDTO = new CreateVehicleDTO();
        createVehicleDTO.setModelo(vehicle.getModelo());
        createVehicleDTO.setPlaca(vehicle.getPlaca());
        createVehicleDTO.setRenavam(vehicle.getRenavam());
        createVehicleDTO.setDriver(vehicle.getDriver());

        return createVehicleDTO;
    }

    public CreateVehicleDTO convertToCreateVehicleDTO(UpdateVehicleDTO vehicle){
        CreateVehicleDTO createVehicleDTO = new CreateVehicleDTO();
        createVehicleDTO.setPlaca(vehicle.getPlaca());
        createVehicleDTO.setRenavam(vehicle.getRenavam());
        createVehicleDTO.setDriver(vehicle.getDriver());

        return createVehicleDTO;
    }

    public UpdateResponseVehicleDTO convertUpdateResponseVehicleDTO(Vehicle vehicle){
        UpdateResponseVehicleDTO updateVehicleDTO = new UpdateResponseVehicleDTO();
        updateVehicleDTO.setPlaca(vehicle.getPlaca());
        updateVehicleDTO.setRenavam(vehicle.getRenavam());
        updateVehicleDTO.setDriver(vehicle.getDriver());

        return updateVehicleDTO;
    }
}
