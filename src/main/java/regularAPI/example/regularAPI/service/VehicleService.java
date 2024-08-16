package regularAPI.example.regularAPI.service;

import org.springframework.stereotype.Service;
import regularAPI.example.regularAPI.domain.vehicle.DTO.VehicleResponseDTO;
import regularAPI.example.regularAPI.domain.vehicle.mapper.VehicleMapper;
import regularAPI.example.regularAPI.repositories.VehicleRepository;

import java.util.List;

@Service
public class VehicleService {

    private VehicleRepository repo;
    private VehicleMapper vehicleMapper;

    public VehicleService(VehicleRepository repo, VehicleMapper vehicleMapper) {
        this.repo = repo;
        this.vehicleMapper = vehicleMapper;
    }

    public List<VehicleResponseDTO> get(){
        return repo.findAll().stream().map(vehicle -> vehicleMapper.convertToVehicleResponseDTO(vehicle)).toList();
    }
}
