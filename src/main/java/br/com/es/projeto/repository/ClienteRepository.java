package br.com.es.projeto.repository;

import br.com.es.projeto.model.entity.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Long> {

}
