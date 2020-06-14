package com.franchises.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.franchises.Domain.Shop;

//@Repository is not required; already exist for JPA
@Transactional(readOnly = true)
public interface ShopRepository extends JpaRepository<Shop, Long> {
	
}
