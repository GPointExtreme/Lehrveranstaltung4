package org.campus02.zinsen.biz;

public class Zinsberechnungen {
	
	public double Kapital = 10000;
	public double Zinsensatz = 2.5;
	public int Tage = 365;
	public double Zinsen = 0;

	public double getZinsen() {
		Zinsen = Kapital * Tage * Zinsensatz /36000;
		return Zinsen;
	}
}
