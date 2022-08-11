package com.aula42.projectProduct.repository;

import com.aula42.projectProduct.model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosModel, Long> {

}
