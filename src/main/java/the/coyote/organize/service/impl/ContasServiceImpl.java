package the.coyote.organize.service.impl;

import org.springframework.stereotype.Service;
import the.coyote.organize.DTO.contas.ContasRequestDTO;
import the.coyote.organize.DTO.contas.ContasResponseDTO;
import the.coyote.organize.entity.BancoEntity;
import the.coyote.organize.entity.ContasEntity;
import the.coyote.organize.exceptions.NotFound;
import the.coyote.organize.repository.BancosRepository;
import the.coyote.organize.repository.ContasRepository;
import the.coyote.organize.service.ContasService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContasServiceImpl implements ContasService {

    private final ContasRepository contasRepository;
    private final BancosRepository bancosRepository;

    public ContasServiceImpl(ContasRepository contasRepository, BancosRepository bancosRepository) {
        this.contasRepository = contasRepository;
        this.bancosRepository = bancosRepository;
    }

    @Override
    public ContasResponseDTO save(ContasRequestDTO contasRequestDTO) {
        return new ContasResponseDTO(contasRepository.save(contasRequestDTO.newContaRequestDTO(bancosRepository)));
    }

    @Override
    public ContasResponseDTO findById(Long id) {
       return new ContasResponseDTO(getId(id));
    }

    @Override
    public List<ContasResponseDTO> findAll() {
        return contasRepository.findAll().stream().map(ContasResponseDTO::new).collect(Collectors.toList());
    }

    @Override
    public ContasResponseDTO update(Long id, ContasRequestDTO contasRequestDTO) {
        ContasEntity resultConta = getId(id);
        BancoEntity resultBanco = bancosRepository.findById(contasRequestDTO.getBancoId()).get();

        {
            resultConta.setContaNumero(contasRequestDTO.getContaNumero());
            resultConta.setBanco(resultBanco);
            resultConta.setChavePix(contasRequestDTO.getChavePix());
            resultConta.setSaldo(contasRequestDTO.getSaldo());;
        }
        return new ContasResponseDTO(contasRepository.save(resultConta));
    }

    @Override
    public void delete(Long id) {
        try {
            contasRepository.deleteById(id);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    /******************************************************************************************************************/

    public ContasEntity getId(Long id) {
        return contasRepository.findById(id).orElseThrow(()-> new NotFound("Sinto Muito! Não encontrei o banco com esse id."));
    }
}
