package br.com.fatec.sistemacomercio.repository;

import br.com.fatec.sistemacomercio.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}