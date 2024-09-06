package regularAPI.example.regularAPI.service;


import org.springframework.stereotype.Service;
import regularAPI.example.regularAPI.domain.violation.DTO.ViolationDTO;
import regularAPI.example.regularAPI.domain.violation.DTO.ViolationResponseDTO;
import regularAPI.example.regularAPI.domain.violation.Violation;
import regularAPI.example.regularAPI.domain.violation.mapper.ViolationMapper;
import regularAPI.example.regularAPI.repositories.ViolationRepository;

import java.util.List;
import java.util.UUID;

@Service
public class ViolationService {

    private final ViolationRepository repo;
    private final ViolationMapper violationMapper;

    public ViolationService(ViolationRepository repo, ViolationMapper violationMapper) {
        this.repo = repo;
        this.violationMapper = violationMapper;
    }

    public List<ViolationResponseDTO> get() {
        return repo.findAll().stream().map(violation -> violationMapper.convertToViolationResponseDTO(violation)).toList();
    }

    public ViolationResponseDTO get(UUID id) {
        return violationMapper.convertToViolationResponseDTO(repo.findById(id).orElse(null));
    }

    public ViolationDTO post(Violation obj){

        Violation violation = new Violation();
        if (obj.getDescription()!= null){
            violation.setDescription(obj.getDescription());
        }
        if (obj.getMoint() > 0){
            violation.setMoint(obj.getMoint());
        }
        if(obj.getRating() !=null){
            violation.setRating(obj.getRating());
        }
        if(obj.getFactor() != null){
            violation.setFactor(violation.getFactor());
        }

        return violationMapper.convertToViolationDTO(repo.save(violation));
    }

    public ViolationDTO put(UUID id, ViolationDTO data) {

        Violation violation = repo.findById(id).orElse(null);

        if (data.getDescription()!= null){
            violation.setDescription(data.getDescription());
        }
        if (data.getMoint() > 0){
            violation.setMoint(data.getMoint());
        }
        if(data.getRating() !=null){
            violation.setRating(data.getRating());
        }
        if(data.getFactor() != null){
            violation.setFactor(data.getFactor());
        }

        repo.save(violation);

        return violationMapper.convertToViolationDTO(violation);

    }

    public String del(UUID id){

        Violation violation = repo.findById(id).orElse(null);
        repo.delete(violation);
        return "deleted";
    }

}
