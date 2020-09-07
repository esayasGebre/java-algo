package ja.designpattern.factorymethod;

public class ShapeFactory {
	public Shape getShape(String myShape){
		
		if(myShape == null) return null;
		
		else if(myShape.equalsIgnoreCase("Circle")){
			return new Circle();
		}
		
		else if(myShape.equalsIgnoreCase("Square")){
			return new Circle();
		}
		
		else if(myShape.equalsIgnoreCase("RECTANGLE")){
			return new Circle();
		}
		return null;
	}
}
