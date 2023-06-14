package the.coyote.organize.service.impl;

import org.springframework.stereotype.Service;
import the.coyote.organize.DTO.bancos.BancosRequestDTO;
import the.coyote.organize.DTO.bancos.BancosResponseDTO;
import the.coyote.organize.entity.BancoEntity;
import the.coyote.organize.exceptions.DuplicateValue;
import the.coyote.organize.exceptions.NotFound;
import the.coyote.organize.repository.BancosRepository;
import the.coyote.organize.service.BancosService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BancosServiceImpl implements BancosService {

    private final BancosRepository bancosRepository;

    public BancosServiceImpl(BancosRepository bancosRepository) {
        this.bancosRepository = bancosRepository;
    }

    @Override
    public BancosResponseDTO save(BancosRequestDTO bancosRequestDTO) throws DuplicateValue {
        if ( findName( bancosRequestDTO.getNome() ) ) throw new DuplicateValue("Sinto muito! Já existe um banco cadastrado com esse nome.");
        if ( findNumero( bancosRequestDTO.getNumero() )) throw new DuplicateValue("Sinto Muito! Jaá existe um banco cadastrado com esse numero");
        return new BancosResponseDTO(bancosRepository.save(bancosRequestDTO.newBanco()));
    }

    @Override
    public BancosResponseDTO findById(Long id) {
        return new BancosResponseDTO(getById(id));
    }

    @Override
    public List<BancosResponseDTO> findAll() {
        return bancosRepository.findAll().stream().map(BancosResponseDTO::new).collect(Collectors.toList());
    }

    @Override
    public BancosResponseDTO update(Long id, BancosRequestDTO bancosRequestDTO) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    /*******************************************************************************************************************/

    private BancoEntity getById(Long id) throws NotFound {
        return bancosRepository.findById(id).orElseThrow(
                () -> new NotFound("Sinto muito! Não encontrei o banco com o id " + id));
    }

    /**
     * Verifica se o nome do Banco existe
     * @param name
     * @return verdadeiro ou falso
     */
    private Boolean findName(String name) {
        return bancosRepository.findByNome(name) != null;
    }

    /**
     * Verifica se o número do banco existe
     * @param numero
     * @return verdadeiro ou falso
     */
    public Boolean findNumero(Integer numero) {
        return bancosRepository.findByNumero(numero) != null;
    }



}
