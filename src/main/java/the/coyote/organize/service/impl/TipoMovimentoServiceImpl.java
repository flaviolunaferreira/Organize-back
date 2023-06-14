package the.coyote.organize.service.impl;

import org.springframework.stereotype.Service;
import the.coyote.organize.DTO.tipoMovimento.TipoMovimentoRequestDTO;
import the.coyote.organize.DTO.tipoMovimento.TipoMovimentoResponseDTO;
import the.coyote.organize.entity.TipoMovimentoEntity;
import the.coyote.organize.exceptions.NotFound;
import the.coyote.organize.repository.TipoMovimentoRepository;
import the.coyote.organize.service.TipoMovimentoService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TipoMovimentoServiceImpl implements TipoMovimentoService {

    private final TipoMovimentoRepository tdmRepository;

    public TipoMovimentoServiceImpl(TipoMovimentoRepository tdmRepository) {
        this.tdmRepository = tdmRepository;
    }

    @Override
    public TipoMovimentoResponseDTO save(TipoMovimentoRequestDTO tdmRequestDTO) {
        return new TipoMovimentoResponseDTO(tdmRepository.save(tdmRequestDTO.newTipoMovimento()));
    }

    @Override
    public TipoMovimentoResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public List<TipoMovimentoResponseDTO> findAll() {
        return tdmRepository.findAll().stream().map(TipoMovimentoResponseDTO::new).collect(Collectors.toList());
    }

    @Override
    public TipoMovimentoResponseDTO update(Long id, TipoMovimentoRequestDTO tDMRequestDTO) {
        return null;
    }

    @Override
    public Object delete(Long id) {
        return null;
    }

    private TipoMovimentoEntity getTipoMovimentoById(Long id) {
        return tdmRepository.findById(id).orElseThrow(() -> new NotFound("Sinto Muito! Não encontrei o tipo de movimento com o id: " + id));
    }


}
