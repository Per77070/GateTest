
public class RationellaTal 
{

int t�ljare=2;
int n�mnare=6;





	void Multiplikation(RationellaTal other) {
		
		t�ljare=other.t�ljare*t�ljare;
		n�mnare=other.n�mnare*n�mnare;				
						
								
				
			}

			void Addition(RationellaTal other) {
			t�ljare=(t�ljare*other.n�mnare+n�mnare*other.t�ljare)/n�mnare*other.n�mnare;
			
			}

public RationellaTal(int x, int y) {
	super();
	this.t�ljare = x;
	this.n�mnare = y;
}

public RationellaTal() {
	// TODO Auto-generated constructor stub
}

public int getX() {
	return t�ljare;
}

public void setX(int x) {
	this.t�ljare = x;
}

public int getY() {
	return n�mnare;
}

public void setY(int y) {
	this.n�mnare = y;
}

@Override
public String toString() {
	return "RationellaTal [x=" + t�ljare + ", y=" + n�mnare + ", getX()=" + getX() + ", getY()=" + getY() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
	
	

	

	
  