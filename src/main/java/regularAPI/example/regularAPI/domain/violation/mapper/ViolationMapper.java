package regularAPI.example.regularAPI.domain.violation.mapper;

import regularAPI.example.regularAPI.domain.violation.Violation;
import regularAPI.example.regularAPI.domain.violation.DTO.ViolationDTO;

public class ViolationMapper {

    public ViolationDTO convertToViolationDTO(Violation violation) {

        ViolationDTO violationDTO = new ViolationDTO();
        violationDTO.setDescription(violation.getDescription());
        violationDTO.setMoint(violation.getMoint());
        return violationDTO;
    }
}
