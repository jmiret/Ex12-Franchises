package com.franchises.Application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.franchises.Domain.Picture;
import com.franchises.Domain.Shop;
import com.franchises.Persistence.PictureRepository;
import com.franchises.Persistence.ShopRepository;

@Configuration
public class LoadDatabase {
	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(ShopRepository shopRepository, PictureRepository pictureRepository) {
		
		return args -> {
			
			Shop shop_1 = new Shop("Shop_1", 15);
			Shop shop_2 = new Shop("Shop_2", 25);
			Shop shop_3 = new Shop("Shop_3", 35);
			
			Picture picture_1 = new Picture("Karma", 12000, shop_1);
			Picture picture_2 = new Picture("Milking Time", "Elioth Gruner", 120000, shop_1);
			Picture picture_3 = new Picture("Bird's Eye View of the City of Omaha Nebraska", "Albert Ruger", 1500000, shop_1);
						
			log.info("Preloading... " + shopRepository.save(shop_1));
			log.info("Preloading... " + shopRepository.save(shop_2));
			log.info("Preloading... " + shopRepository.save(shop_3));
						
			log.info("Preloading... " + pictureRepository.save(picture_1));
			log.info("Preloading... " + pictureRepository.save(picture_2));
			log.info("Preloading... " + pictureRepository.save(picture_3));
									
		};
		
	}
	
}
