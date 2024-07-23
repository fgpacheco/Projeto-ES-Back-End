package br.com.es.projeto.service;

import br.com.es.projeto.model.dto.ClienteDTO;
import br.com.es.projeto.model.entity.Cliente;
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
        Cliente c = new Cliente();
        c.setId(null);
        c.setNome(clienteDTO.getNome());
        c.setCpf(clienteDTO.getCpf());
        long idCriado = clienteRepository.save(c).getId();
        clienteDTO.setId(idCriado);
        return clienteDTO;
    }

    @Override
    public ClienteDTO recover(Long idCliente) {
        Cliente c = clienteRepository.findById(idCliente).get();
        ClienteDTO clienteDTO = new ClienteDTO(c.getId(), c.getNome(), c.getCpf(), null);
        return clienteDTO;
    }

    @Override
    public ClienteDTO update(ClienteDTO clienteDTO) {
        return null;
    }

    @Override
    public void delete(Long idCLiente) {
        clienteRepository.deleteById(idCLiente);

    }
}
