class Square {
	int x; 
	String name; 

	public Square (int x, String name) {
		this.x = x;
		this.name = name; 
	}
	
	public static void main (String args[]) {
		Square sq1 = new Square(6, "name");
	}
}