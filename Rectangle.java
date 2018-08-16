
public class Rectangle implements ShapeInterface {
int x=0;
int y=0;	

	public Rectangle(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		double RArea=y*x;
		
		return RArea;
	}
	@Override
	public double calculateCircumference() {
		// TODO Auto-generated method stub
		double RCircumference=2*x+2*y;
		
		return RCircumference;
	}
	
}
