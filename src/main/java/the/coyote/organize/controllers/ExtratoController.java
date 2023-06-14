package the.coyote.organize.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import the.coyote.organize.DTO.extrato.ExtratoRequestDTO;
import the.coyote.organize.DTO.extrato.ExtratoResponseDTO;
import the.coyote.organize.DTO.movimento.MovimentoRequestDTO;
import the.coyote.organize.service.ExtratoService;

import java.util.List;

@RestController
@RequestMapping("api/v1/extrato")
public class ExtratoController {

    private final ExtratoService extratoService;

    public ExtratoController(ExtratoService extratoService) {
        this.extratoService = extratoService;
    }

    @PostMapping("/")
    public ResponseEntity<ExtratoResponseDTO> save(@RequestBody @Validated ExtratoRequestDTO extratoRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(extratoService.save(extratoRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExtratoResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.FOUND).body(extratoService.findById(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<ExtratoResponseDTO>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(extratoService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ExtratoResponseDTO> update(@PathVariable Long id, @RequestBody MovimentoRequestDTO movimentoRequestDTO) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(extratoService.update(id, movimentoRequestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(extratoService.delete(id));
    }

}
