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

    public List<DriverResponseDTO> getAll() {
        return repo.findAll().stream().map(driver -> driverMapper.convertToDriverResponseDTO(driver)).toList();
    }

    public DriverResponseDTO get(String cpf) {
        if(cpf != null){
            return driverMapper.convertToDriverResponseDTO(repo.findByCpf(cpf));
        }
        return null;
    }

    public Driver post(Driver obj){

        Driver driver = new Driver();
        if (obj.getCpf() != null){
            driver.setCpf(obj.getCpf());
        }
        if (obj.getName() != null){
            driver.setName(obj.getName());
        }
        if(obj.getRenach() !=null){
            driver.setRenach(obj.getRenach());
        }

        return repo.save(driver);
    }

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