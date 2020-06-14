package com.franchises.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.franchises.Domain.Shop;

//@Repository is not required; already exist for JPA
@Transactional(readOnly = true)
public interface ShopRepository extends JpaRepository<Shop, Long> {
	
	@Query(value = "SELECT s from Shop s where s.id = ?1", nativeQuery = false)
	@Transactional
	Shop findShopById(@Param("shopId") Long id);
	
}
