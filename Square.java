class Square{
	int x;
	int sq(){
		return x*x;
	}
	Square(int y){
	x=y;
	}
}
class Squaremain{
	public static void main(String args[]){
		Square  obj1 = new Square(10);
		Square  obj2 = new Square(25);
		Square  obj3 = new Square(30);
		System.out.println("SQ = " + obj1.sq());
		System.out.print("SQ = " + obj2.sq()+"\n");
		System.out.printf("SQ = %d\n" , obj3.sq());
	}
}
