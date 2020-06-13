package com.franchises.Persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.franchises.Domain.Picture;
import com.franchises.Domain.Shop;

//@Repository no hace falta ya que para Spring JpaRepository ja existe
@Transactional(readOnly = true)
public interface ShopRepository extends JpaRepository<Shop, Long> {

	//@Query("<JPQ statement here>")
	//List<Shop> findByPicture(Picture picture);
	
}
