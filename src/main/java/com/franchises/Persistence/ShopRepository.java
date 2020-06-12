package com.franchises.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franchises.Domain.Shop;

public interface ShopRepository extends JpaRepository<Shop, Long> {
	
}
