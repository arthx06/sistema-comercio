package br.com.fatec.sistemacomercio.service;

import br.com.fatec.sistemacomercio.model.Produto;
import br.com.fatec.sistemacomercio.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public void cadastrarProduto(Produto produto) {
        repository.save(produto);
    }
}