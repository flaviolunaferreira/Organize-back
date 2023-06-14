package the.coyote.organize.service;

import org.springframework.stereotype.Service;
import the.coyote.organize.DTO.movimento.MovimentoRequestDTO;
import the.coyote.organize.DTO.movimento.MovimentoResponseDTO;

import java.util.List;

@Service
public interface MovimentoService {
    MovimentoResponseDTO save(MovimentoRequestDTO movimentoRequestDTO);

    MovimentoResponseDTO findById(Long id);

    List<MovimentoResponseDTO> findAll();

    MovimentoResponseDTO update(Long id, MovimentoRequestDTO movimentoRequestDTO);

    Object delete(Long id);
}
