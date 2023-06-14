package the.coyote.organize.service;

import org.springframework.stereotype.Service;
import the.coyote.organize.DTO.tipoMovimento.TipoMovimentoRequestDTO;
import the.coyote.organize.DTO.tipoMovimento.TipoMovimentoResponseDTO;

import java.util.List;

@Service
public interface TipoMovimentoService {
    TipoMovimentoResponseDTO save(TipoMovimentoRequestDTO tDMRequestDTO);

    TipoMovimentoResponseDTO findById(Long id);

    List<TipoMovimentoResponseDTO> findAll();

    TipoMovimentoResponseDTO update(Long id, TipoMovimentoRequestDTO tDMRequestDTO);

    Object delete(Long id);
}
