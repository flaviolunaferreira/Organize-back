package the.coyote.organize.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import the.coyote.organize.DTO.movimento.MovimentoRequestDTO;
import the.coyote.organize.DTO.movimento.MovimentoResponseDTO;
import the.coyote.organize.service.MovimentoService;

import java.util.List;

@RestController
@RequestMapping("api/v1/movimento")
public class MovimentoController {

    private final MovimentoService movimentoService;

    public MovimentoController(MovimentoService movimentoService) {
        this.movimentoService = movimentoService;
    }


    @PostMapping("/")
    public ResponseEntity<MovimentoResponseDTO> save(@RequestBody @Validated MovimentoRequestDTO movimentoRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(movimentoService.save(movimentoRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovimentoResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.FOUND).body(movimentoService.findById(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<MovimentoResponseDTO>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(movimentoService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<MovimentoResponseDTO> update(@PathVariable Long id, @RequestBody MovimentoRequestDTO movimentoRequestDTO) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(movimentoService.update(id, movimentoRequestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(movimentoService.delete(id));
    }

}
