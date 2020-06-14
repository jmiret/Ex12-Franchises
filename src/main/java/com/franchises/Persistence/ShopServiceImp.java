package com.franchises.Persistence;

import java.util.List;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.franchises.Domain.Picture;
import com.franchises.Domain.Shop;

@Repository
@Transactional(readOnly = true)
public class ShopServiceImp implements ShopService {
	
	/* Una vez creado PictureRepository 
	 * ... comentamos los atributos CRUD
	 */
	//@PersistenceContext
	//private EntityManager em;
	
	
	/* Una vez creado ShopRepository 
	 * ... añadimos el atributo de tipo ShopRepository
	 */	
	@Autowired
	private ShopRepository repository;
	
	
	/* Una vez creado PictureRepository 
	 * ... comentamos los métodos CRUD
	 */ 
	@Override
	@Transactional
	public Shop save(Shop shop) {
		//if (shop.getId() == null) { // --> not working
		//if (shop.equal(null)) { // --> Does this text do the same this one? if (shop == null)... 
		/*if (shop == null) {
		      em.persist(shop);
		      return shop;
		} else {
		      return em.merge(shop);
		}*/
		
		return repository.save(shop);
	}
	
	
	/* Una vez creado PictureRepository 
	 * ... comentamos los métodos CRUD
	 */
	@Override
	public List<Shop> findByPicture(Picture picture) {
		/*TypedQuery<Shop> query = em.createQuery("select a from Shop a where a.picture = ?1", Shop.class);
		query.setParameter(1, picture);

		return query.getResultList();*/
		
		//return repository.findByPicture(picture);
		return null;
		
	}

}
