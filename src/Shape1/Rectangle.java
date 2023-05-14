package Shape1;

public class Rectangle implements Drawable,Calculator {

	@Override
	public void calculatorArea() {
		int area = 15*10;
		System.out.println(area);
		
	}

	@Override
	public void calculatePerimeter() {
		int peremeter = (2*10)+(2*15);
		System.out.println(peremeter);
		
	}

	@Override
	public void draw() {
		System.out.println("Reactangle");
		
	}

}
