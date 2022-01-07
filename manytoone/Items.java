package com.te.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;
@Entity
public class Items {
	@Id
	private String itemId;
	private String itemName;
	private String itemQuantity;
	private double cost;
	@ManyToOne
	private Kart kart;
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Kart getKart() {
		return kart;
	}
	public void setKart(Kart kart) {
		this.kart = kart;
	}
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", itemQuantity=" + itemQuantity + ", cost="
				+ cost + ", kart=" + kart + "]";
	}
	
	

}
