
public class AreaCalculator {
	
	int area;
	
	public AreaCalculator(Square sq) {
		area = calculateSquareArea(sq);
	}
	
	public AreaCalculator(Rectangle rt) {
		area = CalculateRecArea(rt);
	}

private int CalculateRecArea(Rectangle rt) {
		// TODO Auto-generated method stub
		return rt.getsidex() * rt.getsidey();
	}

private int calculateSquareArea(Square sq) {

		return sq.getside() * sq.getside();
	}

public static void main (String arg[]) {
	Square sq1 = new Square(5);
	
	AreaCalculator ex = new AreaCalculator(sq1);
	
	System.out.println(ex.area);
	
	Rectangle rt1 = new Rectangle ( 3,4);
	
	AreaCalculator ex2 = new AreaCalculator(rt1);
	
	System.out.println(ex2.area);

}



}
