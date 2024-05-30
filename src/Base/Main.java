package Base;

import Addions.Jalpano;
import Addions.papreka;


public class Main {

	public static void main(String[] args) {
		BasePizza p1 = new Margareta();
		BasePizza p2 = new Jalpano(p1);
		BasePizza p3 = new papreka(p2);
		System.out.println(p3.cost());
		
		
	}
	
}
