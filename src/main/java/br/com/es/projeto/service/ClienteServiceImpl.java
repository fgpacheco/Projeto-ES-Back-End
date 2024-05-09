package br.com.es.projeto.service;

import br.com.es.projeto.model.dto.ClienteDTO;
import br.com.es.projeto.repository.ClienteRepository;
import br.com.es.projeto.service.interfaces.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public ClienteDTO create(ClienteDTO clienteDTO) {
        return null;
    }

    @Override
    public ClienteDTO recover(Long idCliente) {
        return null;
    }

    @Override
    public ClienteDTO update(ClienteDTO clienteDTO) {
        return null;
    }

    @Override
    public void delete(Long idCLiente) {

    }
}
