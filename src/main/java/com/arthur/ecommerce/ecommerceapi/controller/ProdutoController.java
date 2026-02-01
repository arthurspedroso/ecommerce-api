package com.arthur.ecommerce.ecommerceapi.controller;
import com.arthur.ecommerce.ecommerceapi.entity.Produto;
import com.arthur.ecommerce.ecommerceapi.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    private final ProdutoService service;

    public ProdutoController(ProdutoService service){
        this.service = service;
    }

    @GetMapping
    public List<Produto> lista(){
        return service.Listar();
    }

    @PostMapping
    public Produto salva(@RequestBody Produto produto){
        return service.salvar(produto);
    }

    @DeleteMapping("/{id}")
    public void deleta(@PathVariable Long id){
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public Produto atualiza(@PathVariable Long id, @RequestBody Produto produto){
        return service.atualizar(id, produto);
    }
}
