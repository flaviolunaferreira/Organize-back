package the.coyote.organize.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import the.coyote.organize.DTO.bancos.BancosRequestDTO;
import the.coyote.organize.DTO.bancos.BancosResponseDTO;
import the.coyote.organize.service.BancosService;

import java.util.List;

@RestController
@RequestMapping("api/v1/bancos")
public class BancoController {

    private final BancosService bancosService;

    public BancoController(BancosService bancosService) {
        this.bancosService = bancosService;
    }

    @PostMapping("/")
    public ResponseEntity<BancosResponseDTO> save(@RequestBody @Validated BancosRequestDTO bancosRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bancosService.save(bancosRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BancosResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.FOUND).body(bancosService.findById(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<BancosResponseDTO>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(bancosService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<BancosResponseDTO> update(@PathVariable Long id, @RequestBody BancosRequestDTO bancosRequestDTO) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(bancosService.update(id, bancosRequestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        bancosService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}