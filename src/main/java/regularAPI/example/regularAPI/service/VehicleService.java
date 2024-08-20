package regularAPI.example.regularAPI.service;

import org.springframework.stereotype.Service;
import regularAPI.example.regularAPI.domain.driver.Driver;
import regularAPI.example.regularAPI.domain.vehicle.DTO.CreateVehicleDTO;
import regularAPI.example.regularAPI.domain.vehicle.DTO.UpdateResponseVehicleDTO;
import regularAPI.example.regularAPI.domain.vehicle.DTO.UpdateVehicleDTO;
import regularAPI.example.regularAPI.domain.vehicle.DTO.VehicleResponseDTO;
import regularAPI.example.regularAPI.domain.vehicle.Vehicle;
import regularAPI.example.regularAPI.domain.vehicle.mapper.VehicleMapper;
import regularAPI.example.regularAPI.repositories.DriverRepository;
import regularAPI.example.regularAPI.repositories.VehicleRepository;

import java.util.List;
import java.util.UUID;

@Service
public class VehicleService {

    private VehicleRepository repo;
    private VehicleMapper vehicleMapper;
    private DriverRepository driverRepository;

    public VehicleService(VehicleRepository repo, VehicleMapper vehicleMapper, DriverRepository driverRepository) {
        this.repo = repo;
        this.vehicleMapper = vehicleMapper;
        this.driverRepository = driverRepository;
    }

    public List<VehicleResponseDTO> get(){
        return repo.findAll().stream().map(vehicle -> vehicleMapper.convertToVehicleResponseDTO(vehicle)).toList();
    }

    public VehicleResponseDTO get(UUID id){
        return vehicleMapper.convertToVehicleResponseDTO(repo.findById(id).orElse(null));
    }

    public CreateVehicleDTO post(Vehicle obj) {

        System.out.println(obj.getDriver().getId());

        Driver driver = driverRepository.findById(obj.getDriver().getId()).get();

        Vehicle vehicle = new Vehicle();
        vehicle.setModelo(obj.getModelo());
        vehicle.setPlaca(obj.getPlaca());
        vehicle.setVehicle_type(obj.getVehicle_type());
        vehicle.setRenavam(obj.getRenavam());
        vehicle.setDriver(driver);

        return vehicleMapper.convertToCreateVehicleDTO(repo.save(vehicle));
    }
    public UpdateResponseVehicleDTO update(UUID id, UpdateVehicleDTO updateVehicleDTO){
        Vehicle vehicle = repo.findById(id).orElse(null);
        Driver driver = driverRepository.findById(updateVehicleDTO.getDriver().getId()).get();
        vehicle.setPlaca(updateVehicleDTO.getPlaca());
        vehicle.setRenavam(updateVehicleDTO.getRenavam());
        vehicle.setDriver(driver);

        UpdateResponseVehicleDTO vehicleDTO = vehicleMapper.convertUpdateResponseVehicleDTO(repo.save(vehicle));

        return vehicleDTO;

    }

    public String del(UUID id){

        Vehicle vehicle = repo.findById(id).orElse(null);
        repo.delete(vehicle);
        return "deleted";
    }

}
