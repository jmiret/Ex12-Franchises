package com.franchises.Domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Shop {

	private @Id @GeneratedValue long id;
	private String name;
	private int picturesNumber;
	
	@ManyToOne
	private Picture picture;
	
	@OneToMany
	private List<Picture> pictures;	
		
	public Shop() {}

	public Shop(String name, int picturesNumber) {
		super();
		this.name = name;
		this.picturesNumber = picturesNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPicturesNumber() {
		return picturesNumber;
	}

	public void setPicturesNumber(int picturesNumber) {
		this.picturesNumber = picturesNumber;
	}
	
	public void addPicture(Picture picture) {
		this.pictures.add(picture);
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + picturesNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shop other = (Shop) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (picturesNumber != other.picturesNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Shop [name=" + name + ", picturesNumber=" + picturesNumber + "]";
	}
	
}
