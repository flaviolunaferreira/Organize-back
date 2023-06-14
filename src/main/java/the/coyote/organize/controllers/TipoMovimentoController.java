package the.coyote.organize.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import the.coyote.organize.DTO.tipoMovimento.TipoMovimentoRequestDTO;
import the.coyote.organize.DTO.tipoMovimento.TipoMovimentoResponseDTO;
import the.coyote.organize.service.TipoMovimentoService;

import java.util.List;

@RestController
@RequestMapping("api/v1/tipomovimento")
public class TipoMovimentoController {

    private final TipoMovimentoService tdmService;

    public TipoMovimentoController(TipoMovimentoService tdmService) {
        this.tdmService = tdmService;
    }

    @PostMapping("/")
    public ResponseEntity<TipoMovimentoResponseDTO> save(@RequestBody @Validated TipoMovimentoRequestDTO tDMRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(tdmService.save(tDMRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoMovimentoResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.FOUND).body(tdmService.findById(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<TipoMovimentoResponseDTO>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(tdmService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoMovimentoResponseDTO> update(@PathVariable Long id, @RequestBody TipoMovimentoRequestDTO tDMRequestDTO) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(tdmService.update(id, tDMRequestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(tdmService.delete(id));
    }

}
