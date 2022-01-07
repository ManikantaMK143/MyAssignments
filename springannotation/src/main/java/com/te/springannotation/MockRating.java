package com.te.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MockRating {
 
	String rating;
	int theary;
	int practical;
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	public void setTheary(int theary) {
		this.theary = theary;
	}
	public void setPractical(int practical) {
		this.practical = practical;
	}
	@Override
	public String toString() {
		return "MockRating [rating=" + rating + ", theary=" + theary + ", practical=" + practical + "]";
	}
	

}
