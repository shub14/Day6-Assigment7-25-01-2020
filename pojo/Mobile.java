package com.Mobile.pojo;

public class Mobile {
	private Long id;
	private String name;
	private Long price;
	private Long quantity;
	private String description;
	
	public Mobile() {};
	public Mobile(Long id,String name,Long price,Long quantity,String description) {
		this.id=id;
		this.description=description;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	};
	@Override
	public String toString() {
		return "Person{" + "id=" + id + ", name=" + name + ", quantity=" + quantity + '\'' + ", price='" + price
				+ '\'' +",description='"+ description + '}';
	}
}
