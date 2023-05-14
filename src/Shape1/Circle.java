package Shape1;

public class Circle implements Calculator,Drawable {

	@Override
	public void draw() {
		System.out.println("Circle");
		
	}

	@Override
	public void calculatePerimeter() {
		int perimeter = (int) (2*3.14*5);
		System.out.println(perimeter);
		
	}

	@Override
	public void calculatorArea() {
		int area  = (int) (3.14*5*5);
		System.out.println(area);
	}

	
	

}
