package io.github.apiprodutos.produtos.api.controller;

import io.github.apiprodutos.produtos.api.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public void save(Produto produto){
        System.out.println("Produto recebido: "+ produto.toString());
    }
}
