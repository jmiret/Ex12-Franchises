package com.franchises.Persistence;

import java.util.List;

import com.franchises.Domain.Picture;
import com.franchises.Domain.Shop;

public interface ShopService {

	Shop save(Shop shop);
	
	List<Shop> findByPicture(Picture picture);
	
}
