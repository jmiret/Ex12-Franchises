package com.franchises.Persistence;

import java.util.List;

import com.franchises.Domain.Picture;

public interface PictureService {

	Picture findById(Long id);
	
	Picture save(Picture picture);
	
	List<Picture> findAll();
	
	List<Picture> findAll(int page, int pageSize);
	
	List<Picture> findByLastName(String lastName, int page, int pageSize);
	
}
