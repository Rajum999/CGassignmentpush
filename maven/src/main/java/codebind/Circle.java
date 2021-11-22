package codebind;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	Point center;
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	@Required
	public void draw() {
		System.out.println("drawn circle");
		System.out.println("Center of the circle is :" +center.getX()+","+center.getY());
		
	}

}
