package com.te.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Salary {
	@Autowired
	MockRating mockRating;
	

	


	public void setMockRating(MockRating mockRating) {
		this.mockRating = mockRating;
	}





	@Override
	public String toString() {
		return "Salary [mockRating=" + mockRating + "]";
	}
	

}
