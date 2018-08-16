import java.util.Scanner;

public class Hiss {
	int currentFloor = 4;
	int requestedFloor = 0;
int n=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hiss H = new Hiss();
		H.travel();
	}
	
	

		int travel()

	{
		
		Scanner scanner = new Scanner(System.in);
		
		do
		{
			System.out.println("1 2 3 4 5 6 7");
		requestedFloor = scanner.nextInt();
		
		
		
		
		if(requestedFloor>7)
		{
			System.out.println("Byggnaden har bara 7 våningar.");
			
		
		}
		
		else if (requestedFloor > currentFloor) {
			while (currentFloor < requestedFloor) {
				System.out.println("Pling! " + currentFloor);
				currentFloor = currentFloor + 1;
			}

		}

		else if (requestedFloor < currentFloor) {
			while (currentFloor > requestedFloor) {
				System.out.println("Pling! " + currentFloor);

				currentFloor = currentFloor - 1;
			}}

		
		if (requestedFloor == currentFloor) {
			System.out.println("Du är på våning: " + currentFloor);
		
			
			
		
		}
		n++;
		}
		while(n>0);
		
		
		return requestedFloor;
		
		
		
			
	}
		
	int goUp() {

		return currentFloor;
	}

	int goDown() {

		return currentFloor;
	}

	int reachedFloor()
	{
		return currentFloor;
}	
}
