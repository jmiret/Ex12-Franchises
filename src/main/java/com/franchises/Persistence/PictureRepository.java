package com.franchises.Persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.franchises.Domain.Picture;
import com.franchises.Domain.Shop;

//@Transactional(readOnly = true)
//@Transactional
public interface PictureRepository extends JpaRepository<Picture, Long> {
	
	@Query("SELECT p from Picture p where p.shop = :shop")
	List<Picture> findAllByShop(@Param("shop") Shop shop);
		
	@Modifying
	//@Query(value = "DELETE FROM Picture p WHERE p.shop = :shop", nativeQuery = false)
	@Query("DELETE FROM Picture p WHERE p.shop = :shop")
	@Transactional
	void deleteAllPicturesInShop(@Param("shop") Shop shop);
		
}
