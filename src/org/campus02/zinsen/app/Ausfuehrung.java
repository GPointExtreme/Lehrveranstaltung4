package org.campus02.zinsen.app;

import org.campus02.zinsen.biz.Zinsberechnungen;

public class Ausfuehrung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zinsberechnungen Objekt = new Zinsberechnungen();
		
		//Man ruft getZinsen von der Klasse Zinsberechnung auf.
		System.out.println(Objekt.getZinsen());
		
	}

}
