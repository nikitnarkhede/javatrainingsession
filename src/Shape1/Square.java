package Shape1;

public class Square implements Calculator, Drawable {

	@Override
	public void draw() {
		System.out.println("Square");

	}

	@Override
	public void calculatorArea() {
		int area = 5*5;
		System.out.println(area);

	}

	@Override
	public void calculatePerimeter() {
		int peremeter= 4*5;
		System.out.println(peremeter);

	}

}
