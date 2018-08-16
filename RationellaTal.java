
public class RationellaTal 
{

int täljare=2;
int nämnare=6;





	void Multiplikation(RationellaTal other) {
		
		täljare=other.täljare*täljare;
		nämnare=other.nämnare*nämnare;				
						
								
				
			}

			void Addition(RationellaTal other) {
			täljare=(täljare*other.nämnare+nämnare*other.täljare)/nämnare*other.nämnare;
			
			}

public RationellaTal(int x, int y) {
	super();
	this.täljare = x;
	this.nämnare = y;
}

public RationellaTal() {
	// TODO Auto-generated constructor stub
}

public int getX() {
	return täljare;
}

public void setX(int x) {
	this.täljare = x;
}

public int getY() {
	return nämnare;
}

public void setY(int y) {
	this.nämnare = y;
}

@Override
public String toString() {
	return "RationellaTal [x=" + täljare + ", y=" + nämnare + ", getX()=" + getX() + ", getY()=" + getY() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
	
	

	

	
  