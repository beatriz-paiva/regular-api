package regularAPI.example.regularAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import regularAPI.example.regularAPI.domain.driver.DTO.DriverRequestDTO;
import regularAPI.example.regularAPI.domain.driver.Driver;
import regularAPI.example.regularAPI.domain.driver.mapper.DriverMapper;
import regularAPI.example.regularAPI.repositories.DriverRepository;

import java.util.List;
import java.util.UUID;

//
//import org.springframework.stereotype.Service;
//
@Service
public class DriverService <Driver> {

    private DriverRepository repo;
    private DriverMapper driverMapper;

    public DriverService(DriverRepository repo, DriverMapper driverMapper) {
        this.repo = repo;
        this.driverMapper = driverMapper;
    }

    public List<DriverRequestDTO> get() {
        return repo.findAll().stream().map(driver -> driverMapper.convertToDriverRequestDTO(driver)).toList();
    }

    public DriverRequestDTO get(UUID id) {
        return driverMapper.convertToDriverRequestDTO(repo.findById(id).orElse(null));
//        return driverMapper.convertToDriverRequestDTO(repo.findById(id));
//        return repo.findById(driverMapper.convertToDriverRequestDTO(driver));
    }
//
//    public List<DriverRequestDTO> get(String data) {
//        DriverRequestDTO exists = repo.findByCpf(data).orElse(null);
//        DriverRequestDTO
//        assert exists != null;
//        exists.setCpf(exists.getCpf());
//        exists.setName(exists.getName());
//        exists.setRenach(exists.getRenach());
//        return List.of(repo.save(exists));
    }