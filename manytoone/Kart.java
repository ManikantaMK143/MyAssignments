package com.te.manytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Kart {
	@Id
	private String productId;
	private String productName;
	@OneToMany(mappedBy = "kart")
	private List<Items> items;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Kart [productId=" + productId + ", productName=" + productName + ", items=" + items + "]";
	}
	

}
