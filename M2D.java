public class M2D implements ShapeInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub+
		
float CArea=0;
float CCircumference=0;
int i=0;		
int j=0;
Circle[][] number = new Circle[10][10];
		
		
float radius=0;

{
			for (i = 0; i < 10; i++)
				
			{

				
				for (j = 0; j < 10; j++) {

					Circle C=new Circle(i+j);
					number [i][j]=C;
					C.calculateArea();
					C.calculateCircumference();
				CArea+=C.calculateArea();
				CCircumference+=C.calculateCircumference();
				}				

//System.out.println(CArea);
//System.out.println(CCircumference);				
				
			}
			System.out.println("Arean blir: "+CArea);	
			System.out.println("Omkretsen blir :"+CCircumference);
			
			
		}
	
	
	
	}

	@Override
	public double calculateArea() {
		float radius=0;
		double CArea=Math.PI*Math.pow((radius), 2);
		return CArea;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateCircumference() 
	{
		float radius=0;
	double CCircumference=2*Math.PI*radius;
	return CCircumference;
		
		// TODO Auto-generated method stub
		
	}
}



	


