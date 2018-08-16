
public class Circle implements ShapeInterface{

	float radius=0;

public Circle(float radius) {
		super();
		this.radius = radius;
	}
@Override
public double calculateArea() {
	// TODO Auto-generated method stub
	double CArea=Math.PI*Math.pow(radius, 2);
	return CArea;
}
@Override
public double calculateCircumference() {
	// TODO Auto-generated method stub
	
	double CCircumference=2*Math.PI*radius;
return CCircumference;
}



}
