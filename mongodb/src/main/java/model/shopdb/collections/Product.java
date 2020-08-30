package model.shopdb.collections;

public class Product {
	String name, description;
	Double price;
	Specs specs;
	
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Specs getSpecs() {
		return specs;
	}
	public void setSpecs(Specs specs) {
		this.specs = specs;
	}
	
	@Override
	public String toString() {
		return "Products [name=" + name + ", description=" + description + ", price=" + price + ", specs=" + specs
				+ "]";
	}
}
