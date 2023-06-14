package the.coyote.organize.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import the.coyote.organize.DTO.contas.ContasRequestDTO;
import the.coyote.organize.DTO.contas.ContasResponseDTO;
import the.coyote.organize.service.ContasService;

import java.util.List;

@RestController
@RequestMapping("api/v1/contas")
public class ContasController {
    private final ContasService contasService;

    public ContasController(ContasService contasService) {
        this.contasService = contasService;
    }

    @PostMapping("/")
    public ResponseEntity<ContasResponseDTO> save(@RequestBody @Validated ContasRequestDTO contasRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(contasService.save(contasRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContasResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.FOUND).body(contasService.findById(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<ContasResponseDTO>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(contasService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContasResponseDTO> update(@PathVariable Long id, @RequestBody ContasRequestDTO contasRequestDTO) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(contasService.update(id, contasRequestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        contasService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
