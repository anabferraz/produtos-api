package io.github.apiprodutos.produtos.api.controller;

import io.github.apiprodutos.produtos.api.model.Produto;
import io.github.apiprodutos.produtos.api.repository.ProdutoRepository;
import jakarta.annotation.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }
    @PostMapping
    public Produto save(@RequestBody Produto produto){
        System.out.println("Produto recebido: "+ produto.toString());
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto getById(@PathVariable("id") String id){
        System.out.println("Consultando produto com id "+ id);
        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") String id){
        System.out.println("Deletando produto com id "+id);
        produtoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public Produto changeById(@PathVariable("id") String id,
                              @RequestBody Produto produto){
        System.out.println("Alterando produto com id "+id);
        produto.setId(id);
        produtoRepository.save(produto);
        System.out.println("Produto alterado: "+ produto.toString());
        return produto;
    }

    @GetMapping
    public List<Produto> getAll(@RequestParam("name") String name,
                                @Nullable @RequestParam("preco") Double preco){
        return produtoRepository.findByName(name);
    }
}
