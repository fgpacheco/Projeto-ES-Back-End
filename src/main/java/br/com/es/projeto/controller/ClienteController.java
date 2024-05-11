package br.com.es.projeto.controller;

import br.com.es.projeto.model.dto.ClienteDTO;
import br.com.es.projeto.service.interfaces.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<ClienteDTO> create(@RequestBody ClienteDTO clienteDTO) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(clienteService.create(clienteDTO));

    }

    @PutMapping(value = "/update")
    public ResponseEntity<ClienteDTO> update(@RequestBody ClienteDTO clienteDTO) {
        clienteService.update(clienteDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClienteDTO> recover(@PathVariable("id") Long idCliente) {
        return ResponseEntity.ok().body(clienteService.recover(idCliente));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ClienteDTO> delete(@PathVariable("id") Long idCliente) {
        clienteService.delete(idCliente);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
