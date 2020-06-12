package com.franchises.Application;

import java.util.Date;

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
	CommandLineRunner initDatabase1(ShopRepository shopRepository, PictureRepository pictureRepository) {
		
		return args -> {
			
			log.info("Preloading... " + shopRepository.save(new Shop("Shop_1", 25)));
			log.info("Preloading... " + shopRepository.save(new Shop("Shop_2", 35)));
			log.info("Preloading... " + shopRepository.save(new Shop("Shop_3", 45)));
			
			//log.info("Preloading... " + pictureRepository.save(new Picture("Milking Time", "Elioth Gruner", 120000)));
			//log.info("Preloading... " + pictureRepository.save(new Picture()));
			
		};
		
	}
	/*
	@Bean
	CommandLineRunner initDatabase2(PictureRepository pictureRepository) {
		
		return args -> {
			
			log.info("Preloading... " + pictureRepository.save(new Picture("Karma", 12000, new Date(), 1)));
			log.info("Preloading... " + pictureRepository.save(new Picture("Milking Time", "Elioth Gruner", 120000, new Date(), 2)));
			log.info("Preloading... " + pictureRepository.save(new Picture("Bird's Eye View of the City of Omaha Nebraska", "Albert Ruger", 1500000, new Date(), 3)));
			
		};
		
	}
	*/
}
