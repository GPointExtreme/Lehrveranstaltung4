
public class Rechnung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BruchDemo Bruch1 = new BruchDemo(5, 7);
		BruchDemo Bruch2 = new BruchDemo(10, 5);
		BruchDemo Bruch3 = new BruchDemo(2, 1);
		
		
		Bruch1.print();
		System.out.println(Bruch1.toDezimal());
		BruchDemo erg = Bruch1.mulitplicate(Bruch2);
		erg.print();
		System.out.println(Bruch1.counter);
		
	}

}
