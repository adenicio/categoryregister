package com.adenix.categoryregister.repository;
import com.adenix.categoryregister.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepo extends JpaRepository<Categoria,Long>{

}