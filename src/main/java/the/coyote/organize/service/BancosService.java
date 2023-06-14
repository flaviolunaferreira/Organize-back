package the.coyote.organize.service;


import org.springframework.stereotype.Service;
import the.coyote.organize.DTO.bancos.BancosRequestDTO;
import the.coyote.organize.DTO.bancos.BancosResponseDTO;

import java.util.List;

@Service
public interface BancosService {

    BancosResponseDTO save(BancosRequestDTO bancosRequestDTO);

    BancosResponseDTO findById(Long id);

    List<BancosResponseDTO> findAll();

    BancosResponseDTO update(Long id, BancosRequestDTO bancosRequestDTO);

    void deleteById(Long id);
}
