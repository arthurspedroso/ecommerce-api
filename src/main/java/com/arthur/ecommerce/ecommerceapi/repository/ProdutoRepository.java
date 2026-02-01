package com.arthur.ecommerce.ecommerceapi.repository;

import com.arthur.ecommerce.ecommerceapi.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
