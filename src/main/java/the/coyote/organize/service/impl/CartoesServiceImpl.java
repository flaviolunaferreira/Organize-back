package the.coyote.organize.service.impl;

import org.springframework.stereotype.Service;
import the.coyote.organize.DTO.cartoes.CartoesRequestDTO;
import the.coyote.organize.DTO.cartoes.CartoesResponseDTO;
import the.coyote.organize.entity.CartoesEntity;
import the.coyote.organize.entity.ContasEntity;
import the.coyote.organize.exceptions.DuplicateValue;
import the.coyote.organize.exceptions.NotFound;
import the.coyote.organize.repository.CartoesRepository;
import the.coyote.organize.repository.ContasRepository;
import the.coyote.organize.service.CartoesService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartoesServiceImpl implements CartoesService {

    private final CartoesRepository cartoesRepository;
    private final ContasRepository contasRepository;

    public CartoesServiceImpl(CartoesRepository cartoesRepository, ContasRepository contasRepository) {
        this.cartoesRepository = cartoesRepository;
        this.contasRepository = contasRepository;
    }

    @Override
    public CartoesResponseDTO save(CartoesRequestDTO cartoesRequestDTO) {
        return new CartoesResponseDTO(cartoesRepository.save(cartoesRequestDTO.newCartao(contasRepository)));
    }

    @Override
    public CartoesResponseDTO findById(Long id) {
        return new CartoesResponseDTO(getCartoesById(id));
    }

    @Override
    public List<CartoesResponseDTO> findAll() {
        return cartoesRepository.findAll().stream().map(CartoesResponseDTO::new).collect(Collectors.toList());
    }

    @Override
    public CartoesResponseDTO update(Long id, CartoesRequestDTO cartoesRequestDTO) {
        CartoesEntity result = getCartoesById(id);
        ContasEntity contasEntity = getContaById(cartoesRequestDTO.getConta());
        {
            result.setCartaoNumero(cartoesRequestDTO.getCartaoNumero());
            result.setConta(contasEntity);
            result.setTipo(cartoesRequestDTO.getTipo());
        }
        return new CartoesResponseDTO(cartoesRepository.save(result)) ;
    }

    @Override
    public void delete(Long id) {
        try {
            cartoesRepository.deleteById(id);
        } catch(Exception e) {
           throw new DuplicateValue("Erro ao apagar registro");
        }

    }

    /******************************************************************************************************************/

    private CartoesEntity getCartoesById(Long id) {
        return cartoesRepository.findById(id).orElseThrow(() -> new NotFound("Sinto muito! Id do cartão não encontrado."));
    }

    private ContasEntity getContaById(Long id) {
        return contasRepository.findById(id).orElseThrow(() -> new NotFound("Sinto muito! Id da conta não encontrado."));
    }
}
