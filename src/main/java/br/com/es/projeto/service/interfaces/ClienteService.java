package br.com.es.projeto.service.interfaces;

import br.com.es.projeto.model.dto.ClienteDTO;

public interface ClienteService {

    ClienteDTO create(ClienteDTO clienteDTO);

    ClienteDTO recover(Long idCliente);

    ClienteDTO update(ClienteDTO clienteDTO);

    void delete(Long idCliente);

}
