package regularAPI.example.regularAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import regularAPI.example.regularAPI.domain.vehicle.DTO.VehicleResponseDTO;
import regularAPI.example.regularAPI.domain.vehicle.Vehicle;
import regularAPI.example.regularAPI.service.VehicleService;

import java.util.List;

@RestController
@RequestMapping("/api/regular/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService service;

    @GetMapping("/")
    public ResponseEntity<List<VehicleResponseDTO>> get(){
        List<VehicleResponseDTO> response = service.get();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
