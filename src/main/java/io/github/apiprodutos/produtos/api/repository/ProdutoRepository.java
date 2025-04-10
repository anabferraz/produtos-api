package io.github.apiprodutos.produtos.api.repository;

import io.github.apiprodutos.produtos.api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto,String> {
        List<Produto> findByName(String name);
}
