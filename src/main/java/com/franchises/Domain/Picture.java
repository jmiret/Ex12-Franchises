package com.franchises.Domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Picture {
	
	private @Id @GeneratedValue long id;
	private String pictureAuthor;
	private String pictureName;
	private double price;
	private long shopID;
	
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	private Date dateReg;
			
	public Picture() {}
	
	/*
	public Picture(String pictureName, double price, long shopID) {
		super();
		this.pictureName = pictureName;
		this.price = price;		
		this.shopID = shopID;
		this.pictureAuthor = "Anonymous";
	}

	public Picture(String pictureName, double price, Date dateReg, long shopID) {
		super();
		this.pictureName = pictureName;
		this.price = price;
		this.dateReg = dateReg;
		this.shopID = shopID;
		this.pictureAuthor = "Anonymous";
	}
					
	public Picture(String pictureName, String pictureAuthor, double price, Date dateReg, long shopID) {
		super();
		this.pictureName = pictureName;
		this.pictureAuthor = pictureAuthor;		
		this.price = price;
		this.dateReg = dateReg;
		this.shopID = shopID;
	}
	*/
	
	public Picture(String pictureName, String pictureAuthor, double price) {
		super();
		this.pictureName = pictureName;
		this.pictureAuthor = pictureAuthor;		
		this.price = price;
		//this.dateReg = new Date();
	}

	
	public String getPictureAuthor() {
		return pictureAuthor;
	}

	public void setPictureAuthor(String pictureAuthor) {
		this.pictureAuthor = pictureAuthor;
	}

	public String getPictureName() {
		return pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDateReg() {
		return dateReg;
	}

	public void setDateReg(Date dateReg) {
		this.dateReg = dateReg;
	}
	
	
	public long getShopID() {
		return shopID;
	}

	public void setShopID(long shopID) {
		this.shopID = shopID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateReg == null) ? 0 : dateReg.hashCode());
		result = prime * result + ((format == null) ? 0 : format.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((pictureAuthor == null) ? 0 : pictureAuthor.hashCode());
		result = prime * result + ((pictureName == null) ? 0 : pictureName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (shopID ^ (shopID >>> 32));
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
		Picture other = (Picture) obj;
		if (dateReg == null) {
			if (other.dateReg != null)
				return false;
		} else if (!dateReg.equals(other.dateReg))
			return false;
		if (format == null) {
			if (other.format != null)
				return false;
		} else if (!format.equals(other.format))
			return false;
		if (id != other.id)
			return false;
		if (pictureAuthor == null) {
			if (other.pictureAuthor != null)
				return false;
		} else if (!pictureAuthor.equals(other.pictureAuthor))
			return false;
		if (pictureName == null) {
			if (other.pictureName != null)
				return false;
		} else if (!pictureName.equals(other.pictureName))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (shopID != other.shopID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Picture [id=" + id + ", pictureAuthor=" + pictureAuthor + ", pictureName=" + pictureName + ", price="
				+ price + ", shopID=" + shopID + ", format=" + format + ", dateReg=" + dateReg + "]";
	}
	
}
