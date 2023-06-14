package the.coyote.organize.service.impl;

import org.springframework.stereotype.Service;
import the.coyote.organize.DTO.movimento.MovimentoRequestDTO;
import the.coyote.organize.DTO.movimento.MovimentoResponseDTO;
import the.coyote.organize.repository.MovimentoRepository;
import the.coyote.organize.service.MovimentoService;

import java.util.List;

@Service
public class MovimentoServiceImpl implements MovimentoService {

    private final MovimentoRepository movimentoRepository;

    public MovimentoServiceImpl(MovimentoRepository movimentoRepository) {
        this.movimentoRepository = movimentoRepository;
    }

    @Override
    public MovimentoResponseDTO save(MovimentoRequestDTO movimentoRequestDTO) {
        return null;
    }

    @Override
    public MovimentoResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public List<MovimentoResponseDTO> findAll() {
        return null;
    }

    @Override
    public MovimentoResponseDTO update(Long id, MovimentoRequestDTO movimentoRequestDTO) {
        return null;
    }

    @Override
    public Object delete(Long id) {
        return null;
    }
}
