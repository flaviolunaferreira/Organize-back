package the.coyote.organize.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import the.coyote.organize.DTO.cartoes.CartoesRequestDTO;
import the.coyote.organize.DTO.cartoes.CartoesResponseDTO;
import the.coyote.organize.service.CartoesService;

import java.util.List;

@RestController
@RequestMapping("api/v1/cartoes")
public class CartoesController {

    private final CartoesService cartoesService;

    public CartoesController(CartoesService cartoesService) {
        this.cartoesService = cartoesService;
    }

    @PostMapping("/")
    public ResponseEntity<CartoesResponseDTO> save(@RequestBody @Validated CartoesRequestDTO cartoesRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cartoesService.save(cartoesRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CartoesResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.FOUND).body(cartoesService.findById(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<CartoesResponseDTO>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(cartoesService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<CartoesResponseDTO> update(@PathVariable Long id, @RequestBody CartoesRequestDTO cartoesRequestDTO) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(cartoesService.update(id, cartoesRequestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    
}
