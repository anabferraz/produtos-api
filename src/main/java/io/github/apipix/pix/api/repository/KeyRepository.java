package io.github.apipix.pix.api.repository;

import io.github.apipix.pix.api.model.Key;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KeyRepository extends JpaRepository<Key,String> {
        List<Key> findByValue(String value);
}
