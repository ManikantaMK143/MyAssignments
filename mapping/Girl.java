package com.te.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Girl {
	@Id
	private int girlId;
	private String name;
	@OneToOne
	private Boy boy;
	public int getGirlId() {
		return girlId;
	}
	public void setGirlId(int girlId) {
		this.girlId = girlId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boy getBoy() {
		return boy;
	}
	public void setBoy(Boy boy) {
		this.boy = boy;
	}
	@Override
	public String toString() {
		return "Girl [girlId=" + girlId + ", name=" + name + ", boy=" + boy + "]";
	}
	

}
