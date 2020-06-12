package com.franchises.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franchises.Domain.Picture;

public interface PictureRepository extends JpaRepository<Picture, Long> {

}
