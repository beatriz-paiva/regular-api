package regularAPI.example.regularAPI.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import regularAPI.example.regularAPI.domain.driver.DTO.DriverRequestDTO;
import regularAPI.example.regularAPI.domain.driver.DTO.DriverResponseDTO;
import regularAPI.example.regularAPI.domain.driver.Driver;
import regularAPI.example.regularAPI.domain.driver.mapper.DriverMapper;
import regularAPI.example.regularAPI.repositories.DriverRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//
//import org.springframework.stereotype.Service;
//
@Service
public class DriverService {

    private DriverRepository repo;
    private DriverMapper driverMapper;

    public DriverService(DriverRepository repo, DriverMapper driverMapper) {
        this.repo = repo;
        this.driverMapper = driverMapper;
    }

    public List<DriverResponseDTO> get() {
        return repo.findAll().stream().map(driver -> driverMapper.convertToDriverResponseDTO(driver)).toList();
    }

    public DriverResponseDTO get(UUID id) {
        return driverMapper.convertToDriverResponseDTO(repo.findById(id).orElse(null));
    }

//    public List<DriverResponseDTO> get(String data) {
//        DriverResponseDTO exists = repo.findByCpf(data).orElse(null);
//        DriverResponseDTO
//        assert exists != null;
//        exists.setCpf(exists.getCpf());
//        exists.setName(exists.getName());
//        exists.setRenach(exists.getRenach());
//        return List.of(repo.save(exists));


    public DriverRequestDTO put(String cpf, DriverRequestDTO data) {

        Driver driver = repo.findByCpf(cpf);

        if (data.name != null){
            driver.setName(data.name);
        }
        if(data.renach !=null){
            driver.setRenach(data.renach);
        }

        repo.save(driver);

        return driverMapper.convertToDriverRequestDTO(driver);

    }

    public String del(UUID id){

        Driver driver = repo.findById(id).orElse(null);
        repo.delete(driver);
        return "deleted";
    }



}