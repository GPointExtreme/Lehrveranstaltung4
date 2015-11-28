
public class BruchDemo {
	
	private int Nenner;
	private int Zähler;
	
	public BruchDemo (int Nenner, int Zähler) {
		this.Nenner = Nenner;
		this.Zähler = Zähler;
	}
	
	public int getNenner() {
		return Nenner;
	}
	
	public int getZähler() {
		return Zähler;
	}
	
	public double toDezimal() {
		return (Nenner*1.0)/Zähler;
	}
	
	public void print () {
		System.out.println(Nenner + "/" + Zähler);
	}
	
	public BruchDemo mulitplicate(BruchDemo Bruch1) {
		
		int NewNenner=this.Nenner*Bruch1.getNenner();
		int NewZähler=this.Zähler*Bruch1.getNenner();
		
		BruchDemo ergebnis = new BruchDemo(NewNenner, NewZähler);
		return ergebnis;
	}

}
