package regularAPI.example.regularAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import regularAPI.example.regularAPI.domain.vehicle.DTO.CreateVehicleDTO;
import regularAPI.example.regularAPI.domain.vehicle.DTO.UpdateResponseVehicleDTO;
import regularAPI.example.regularAPI.domain.vehicle.DTO.UpdateVehicleDTO;
import regularAPI.example.regularAPI.domain.vehicle.DTO.VehicleResponseDTO;
import regularAPI.example.regularAPI.domain.vehicle.Vehicle;
import regularAPI.example.regularAPI.service.VehicleService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/regular/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService service;

    @GetMapping("/all")
    public ResponseEntity<List<VehicleResponseDTO>> get(){
        List<VehicleResponseDTO> response = service.get();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<VehicleResponseDTO> get(@RequestParam UUID id){
        var response = service.get(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<CreateVehicleDTO> post(@RequestBody Vehicle obj){
        var response = service.post(obj);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PatchMapping("/")
    public ResponseEntity<UpdateResponseVehicleDTO> update(@RequestParam UUID id, @RequestBody UpdateVehicleDTO obj){
        var response = service.update(id, obj);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
