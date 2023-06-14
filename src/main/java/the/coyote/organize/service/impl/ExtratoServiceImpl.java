package the.coyote.organize.service.impl;

import org.springframework.stereotype.Service;
import the.coyote.organize.DTO.extrato.ExtratoRequestDTO;
import the.coyote.organize.DTO.extrato.ExtratoResponseDTO;
import the.coyote.organize.DTO.movimento.MovimentoRequestDTO;
import the.coyote.organize.repository.ExtratoRepository;
import the.coyote.organize.service.ExtratoService;

import java.util.List;

@Service
public class ExtratoServiceImpl implements ExtratoService {

    private final ExtratoRepository extratoRepository;

    public ExtratoServiceImpl(ExtratoRepository extratoRepository) {
        this.extratoRepository = extratoRepository;
    }

    @Override
    public ExtratoResponseDTO save(ExtratoRequestDTO extratoRequestDTO) {
        return null;
    }

    @Override
    public ExtratoResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public List<ExtratoResponseDTO> findAll() {
        return null;
    }

    @Override
    public ExtratoResponseDTO update(Long id, MovimentoRequestDTO movimentoRequestDTO) {
        return null;
    }

    @Override
    public Object delete(Long id) {
        return null;
    }
}
