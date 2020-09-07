package ja.designpattern.factorymethod;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		ShapeFactory sFactory = new ShapeFactory();
		
		Shape shape1 = sFactory.getShape("circle");
		shape1.draw();
		
		shape1 = sFactory.getShape("square");
		shape1.draw();
		
		shape1 = sFactory.getShape("Rectangle");
		shape1.draw();
				

	}

}
