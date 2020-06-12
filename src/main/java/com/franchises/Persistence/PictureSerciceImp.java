package com.franchises.Persistence;

import java.util.List;
//import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.franchises.Domain.Picture;

@Repository
@Transactional(readOnly = true)
public class PictureSerciceImp implements PictureService {
		
	@PersistenceContext
	private EntityManager em;

	
	/* Una vez creado PictureRepository 
	 * ... añadimos el atributo de tipo PictureRepository
	 */	
	@Autowired
	private PictureRepository repository;
	
	
	/* Una vez creado PictureRepository 
	 * ... comentamos los métodos CRUD
	 */ 
	@Override
	public List<Picture> findAll() {		
		//return em.createQuery("Select p from Picture p", Picture.class).getResultList();
		return repository.findAll();
	}
	
	/* Una vez creado PîctureRepository 
	 * ... comentamos los métodos CRUD
	 */
	@Override
	public Picture findById(Long id) {
		// TODO Auto-generated method stub
		//return em.find(Picture.class, id);
		//return repository.findById(id); // --> not working
		return null;
	}
	
	@Override
	public List<Picture> findAll(int page, int pageSize) {
		// TODO Auto-generated method stub
		TypedQuery<Picture> query = em.createQuery("Select p from Picture p", Picture.class);
		
		query.setFirstResult(page * pageSize);
		query.setMaxResults(pageSize);
		
		return query.getResultList();
	}

	@Override
	public List<Picture> findByLastName(String lastName, int page, int pageSize) {
		// TODO Auto-generated method stub
		TypedQuery<Picture> query = em.createQuery("Select p from Picture p where p.lastname = ?1", Picture.class);
		query.setParameter(1, lastName);
		query.setFirstResult(page * pageSize);
		query.setMaxResults(pageSize);
		
		return query.getResultList();
	}

	@Override
	@Transactional
	public Picture save(Picture picture) {
		// TODO Auto-generated method stub
		//if (picture.getId() == null) { // --> not working
		//if (picture.equal(null)) { // --> Does this text do the same this one? if (picture == null)... 
		if (picture == null) {
			em.persist(picture);
			return picture;
		} else {
			return em.merge(picture);
		}
	}
	
}
