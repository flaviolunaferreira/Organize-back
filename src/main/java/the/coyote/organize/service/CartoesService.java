package the.coyote.organize.service;

import org.springframework.stereotype.Service;
import the.coyote.organize.DTO.cartoes.CartoesRequestDTO;
import the.coyote.organize.DTO.cartoes.CartoesResponseDTO;

import java.util.List;

@Service
public interface CartoesService {
    CartoesResponseDTO save(CartoesRequestDTO cartoesRequestDTO);

    CartoesResponseDTO findById(Long id);

    List<CartoesResponseDTO> findAll();

    CartoesResponseDTO update(Long id, CartoesRequestDTO cartoesRequestDTO);

    void delete(Long id);
}
