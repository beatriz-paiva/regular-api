package regularAPI.example.regularAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import regularAPI.example.regularAPI.domain.violation.DTO.ViolationDTO;
import regularAPI.example.regularAPI.domain.violation.Violation;
import regularAPI.example.regularAPI.service.ViolationService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/regular/violation")
public class ViolationController {

    @Autowired
    private final ViolationService service;

    public ViolationController(ViolationService service) {
        this.service = service;
    }

    @GetMapping("/all")

    public ResponseEntity<List<ViolationDTO>> get(){
        List<ViolationDTO> response = service.get();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<ViolationDTO> get(@RequestParam UUID id){
        var response = service.get(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<ViolationDTO> post(@RequestBody Violation obj){
        var response = service.post(obj);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PatchMapping("/")
    public ResponseEntity<ViolationDTO> update(@RequestParam UUID id, @RequestBody ViolationDTO obj){
        var response = service.put(id, obj);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

