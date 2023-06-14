package the.coyote.organize.service;

import org.springframework.stereotype.Service;
import the.coyote.organize.DTO.contas.ContasRequestDTO;
import the.coyote.organize.DTO.contas.ContasResponseDTO;

import java.util.List;

@Service    
public interface ContasService {
    ContasResponseDTO save(ContasRequestDTO contasRequestDTO);

    ContasResponseDTO findById(Long id);

    List<ContasResponseDTO> findAll();

    ContasResponseDTO update(Long id, ContasRequestDTO contasRequestDTO);

    void delete(Long id);
}
