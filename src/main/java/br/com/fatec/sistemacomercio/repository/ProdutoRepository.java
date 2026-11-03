package br.com.fatec.sistemacomercio.repository;

import br.com.fatec.sistemacomercio.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}