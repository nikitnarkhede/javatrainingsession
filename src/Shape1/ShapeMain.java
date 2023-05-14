package Shape1;

public class ShapeMain {
	public static void main(String args[]) {

	Circle c = new Circle();
	Rectangle r = new Rectangle();
	Square s = new Square();
	
	c.draw();
	c.calculatePerimeter();
	c.calculatorArea();
	
	r.draw();
	r.calculatePerimeter();
	r.calculatorArea();
	
	s.draw();
	s.calculatePerimeter();
	s.calculatorArea();
}}
