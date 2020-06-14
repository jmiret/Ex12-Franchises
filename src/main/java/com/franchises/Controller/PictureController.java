package com.franchises.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.franchises.Domain.Picture;
import com.franchises.Domain.Shop;
import com.franchises.Persistence.PictureRepository;
import com.franchises.Persistence.ShopRepository;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PictureController {
	
	private final PictureRepository pictureRepository;
	//private final ShopRepository shopRepository;
		
	public PictureController(PictureRepository pictureRepository) {		
		super();
		this.pictureRepository = pictureRepository;
	}
		
	// readerAllPictures
	@GetMapping("/pictures")
	List<Picture> readerAllPictures() {
		return pictureRepository.findAll();
	}
	
	/*
	// createPicture
	@PostMapping("/shops/{id}/pictures")
	Picture addPicture(@RequestBody Picture newPicture, @PathVariable Long id) {
		//newPicture.setShopID(id);
		//return pictureRepository.save(newPicture);
		return null;
	}
	*/
	
	/*
	// readerAllPicturesInShop	
	@GetMapping("/shops/{id}/pictures")
	List<Picture> readerAllPicturesInShop(@RequestBody Shop shop, @PathVariable Long id) {	
	 
		return pictureRepository.findByShop(shop);
		//return null;
	}
	*/

}
