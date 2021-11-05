package abs.quiz;

public class Rect extends Shape {
	
	private int side;

	  
	
	public Rect(String name, int side) {
		super(name);
		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;
	}

}
