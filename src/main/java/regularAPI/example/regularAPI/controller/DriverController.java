package regularAPI.example.regularAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import regularAPI.example.regularAPI.domain.driver.DTO.DriverRequestDTO;
import regularAPI.example.regularAPI.domain.driver.Driver;
import regularAPI.example.regularAPI.service.DriverService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/regular")
public class DriverController <Driver> {

    @Autowired
    private DriverService service;

    @GetMapping("/drivers")
    public ResponseEntity<List<DriverRequestDTO>> get() {
        List<DriverRequestDTO> response = service.get();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<DriverRequestDTO> get(@RequestParam UUID id) {
        DriverRequestDTO response = service.get(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<List<Driver>> patch(String data) {
        return null;
    }

    public ResponseEntity<Driver> insert(Driver obj) {
        return null;

    }

    public ResponseEntity<Driver> update(Driver obj) {
        return null;
    }

    public ResponseEntity<?> delete(Long id) {
        return null;
    }
}
