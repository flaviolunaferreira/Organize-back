package the.coyote.organize.service;

import org.springframework.stereotype.Service;
import the.coyote.organize.DTO.extrato.ExtratoRequestDTO;
import the.coyote.organize.DTO.extrato.ExtratoResponseDTO;
import the.coyote.organize.DTO.movimento.MovimentoRequestDTO;

import java.util.List;

@Service
public interface ExtratoService {
    ExtratoResponseDTO save(ExtratoRequestDTO extratoRequestDTO);

    ExtratoResponseDTO findById(Long id);

    List<ExtratoResponseDTO> findAll();

    ExtratoResponseDTO update(Long id, MovimentoRequestDTO movimentoRequestDTO);

    Object delete(Long id);
}
