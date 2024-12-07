package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;


@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private String brand;
	private BigDecimal price;
	private String category;
	private Date release_Date;
	private boolean productAvailable;
	private int stockQuantity;
	
	private String imageName;
	private String imageType;
	@Lob
	private byte[] ImageData;
	
	
	public Product(int id, String name, String description, String brand, BigDecimal price, String category,
			Date release_Date, boolean productAvailable, int stockQuantity, String imageName, String imgaeType,
			byte[] imageData) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.category = category;
		this.release_Date = release_Date;
		this.productAvailable = productAvailable;
		this.stockQuantity = stockQuantity;
		this.imageName = imageName;
		this.imageType = imgaeType;
		ImageData = imageData;
	}

	public Product() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public Date getRelease_Date() {
		return release_Date;
	}


	public void setRelease_Date(Date release_Date) {
		this.release_Date = release_Date;
	}


	public boolean isProductAvailable() {
		return productAvailable;
	}


	public void setProductAvailable(boolean productAvailable) {
		this.productAvailable = productAvailable;
	}


	public int getStockQuantity() {
		return stockQuantity;
	}


	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}


	public String getImageName() {
		return imageName;
	}


	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	public String getImageType() {
		return imageType;
	}


	public void setImageType(String imageType) {
		this.imageType = imageType;
	}


	public byte[] getImageData() {
		return ImageData;
	}


	public void setImageData(byte[] imageData) {
		ImageData = imageData;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", brand=" + brand + ", price="
				+ price + ", category=" + category + ", release_Date=" + release_Date + ", productAvailable="
				+ productAvailable + ", stockQuantity=" + stockQuantity + ", imageName=" + imageName + ", imgaeType="
				+ imageType + ", ImageData=" + Arrays.toString(ImageData) + "]";
	}
	
	
}
