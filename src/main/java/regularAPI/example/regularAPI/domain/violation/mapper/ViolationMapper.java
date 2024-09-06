package regularAPI.example.regularAPI.domain.violation.mapper;

import org.springframework.stereotype.Service;
import regularAPI.example.regularAPI.domain.violation.DTO.ViolationResponseDTO;
import regularAPI.example.regularAPI.domain.violation.Violation;
import regularAPI.example.regularAPI.domain.violation.DTO.ViolationDTO;

@Service
public class ViolationMapper {

    public ViolationDTO convertToViolationDTO(Violation violation) {

        ViolationDTO violationDTO = new ViolationDTO();
        violationDTO.setDescription(violation.getDescription());
        violationDTO.setMoint(violation.getMoint());
        return violationDTO;
    }

    public ViolationResponseDTO convertToViolationResponseDTO(Violation violation) {

        ViolationResponseDTO violationResponseDTO = new ViolationResponseDTO();
        violationResponseDTO.setDescription(violation.getDescription());
        violationResponseDTO.setMoint(violation.getMoint());
        return violationResponseDTO;
    }
}
