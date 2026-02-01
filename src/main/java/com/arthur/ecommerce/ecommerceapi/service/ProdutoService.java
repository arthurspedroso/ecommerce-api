package com.arthur.ecommerce.ecommerceapi.service;

import com.arthur.ecommerce.ecommerceapi.entity.Produto;
import com.arthur.ecommerce.ecommerceapi.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository){
        this.repository = repository;
    }

    public List<Produto> Listar(){
        return repository.findAll();
    }

    public Produto salvar(Produto produto){
        if(produto.getEstoque() < 0){
            throw new RuntimeException("Valor de estoque nao permitido");
        }else{
            return repository.save(produto);
        }
    }

    public void deletar(Long id){
        if(!repository.existsById(id)) {
            throw new RuntimeException("Produto com ID "+ id + " nao existe");
        }else{
            repository.deleteById(id);
        }
    }

    public Produto atualizar(Long id, Produto nProduto){
        Produto aProduto = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto com ID " + id + " nao existe"));

        if (nProduto.getNome() != null) {
            aProduto.setNome(nProduto.getNome());
        }
        if (nProduto.getDescricao() != null) {
            aProduto.setDescricao(nProduto.getDescricao());
        }
        if (nProduto.getPreco() > 0) {
            aProduto.setPreco(nProduto.getPreco());
        }
        if (nProduto.getEstoque() >= 0) {
            aProduto.setEstoque(nProduto.getEstoque());
        }
        return repository.save(aProduto);
    }
}
