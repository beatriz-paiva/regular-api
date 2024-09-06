package regularAPI.example.regularAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import regularAPI.example.regularAPI.domain.driver.DTO.DriverRequestDTO;
import regularAPI.example.regularAPI.domain.driver.DTO.DriverResponseDTO;
import regularAPI.example.regularAPI.domain.driver.Driver;
import regularAPI.example.regularAPI.service.DriverService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/regular/drivers")
public class DriverController {

    @Autowired
    private DriverService service;

    @GetMapping("/all")
    public ResponseEntity<List<DriverResponseDTO>> getAll() {
        List<DriverResponseDTO> response = service.getAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<DriverResponseDTO> get(@RequestParam String cpf) {
        System.out.println(cpf);
        DriverResponseDTO response = service.get(cpf);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/put")
    public DriverRequestDTO put(@RequestParam String cpf, @RequestBody DriverRequestDTO data) {
        System.out.println(cpf);
        DriverRequestDTO response = service.put(cpf, data);
        return response;
    }

    @PostMapping("/")
    public String post(@RequestBody Driver obj) {
        try {
            service.post(obj);
            return "Dados inseridos com sucesso";
        }catch (Exception e){
            return "Tente novamente";
        }

    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable UUID id) {
        var response = service.del(id);
        return response;
    }
}
