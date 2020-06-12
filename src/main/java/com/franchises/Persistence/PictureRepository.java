package com.franchises.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.franchises.Domain.Picture;

@Transactional(readOnly = true)
public interface PictureRepository extends JpaRepository<Picture, Long> {

}
