class Square {
	int x;  

	public Square (int x) {
		this.x = x;
	}
	
	public int getside() {
		return x;
	}
	
	public static void main (String args[]) {
		Square sq1 = new Square(6);
	}
}