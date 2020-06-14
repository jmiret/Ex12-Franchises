package com.franchises.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.franchises.Domain.Shop;

//@Repository is not required; already exist for JPA
@Transactional(readOnly = true)
public interface ShopRepository extends JpaRepository<Shop, Long> {
	
	@Query("SELECT s from Shop s where s.id = :id")
	Shop findShopById(@Param("id") Long id);
	
}
