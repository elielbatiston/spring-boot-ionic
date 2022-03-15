package com.elielbatiston.backend.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elielbatiston.backend.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Serializable> {

}