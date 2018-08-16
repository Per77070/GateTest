
public class ShapeHandler {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		Rectangle rektangel=new Rectangle(3,1);
Circle cirkel =new Circle(0.5f);
Circle cirkel2=new Circle(1);

cirkel.calculateArea();
cirkel2.calculateArea();

cirkel.calculateCircumference();
cirkel2.calculateCircumference();

rektangel.calculateCircumference();

rektangel.calculateArea();

      double Area=cirkel.calculateArea()+cirkel2.calculateArea()+rektangel.calculateArea();
	  double Circumference=cirkel.calculateCircumference()+cirkel2.calculateCircumference()+rektangel.calculateCircumference();

	System.out.println("Ytan blir: "+Area);
	System.out.println("Omkretsen blir: "+Circumference);

	
}}
