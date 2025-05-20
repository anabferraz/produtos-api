package io.github.apipix.pix.api.controller;

import io.github.apipix.pix.api.model.Key;
import io.github.apipix.pix.api.repository.KeyRepository;
import jakarta.annotation.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("keys")
public class KeyController {

    private final KeyRepository keysRepository;

    public KeyController(KeyRepository keysRepository){
        this.keysRepository = keysRepository;
    }

    @PostMapping
    public Key save(@RequestBody Key key){
        System.out.println("Chave PIX recebida: "+ key.toString());
        keysRepository.save(key);
        return key;
    }

    @GetMapping("/{id}")
    public Key getById(@PathVariable("id") String id){
        System.out.println("Consultando produto com id "+ id);
        return keysRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") String id){
        System.out.println("Deletando chave com id "+id);
        keysRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public Key changeById(@PathVariable("id") String id,
                          @RequestBody Key key){
        System.out.println("Alterando chave com id "+id);
        key.setId(id);
        keysRepository.save(key);
        System.out.println("Chave PIX alterada: "+ key.toString());
        return key;
    }

    @GetMapping
    public List<Key> getAll(@RequestParam("chave_pix") String key,
                            @Nullable @RequestParam("preco") Double preco){
        return keysRepository.findByValue(key);
    }
}
