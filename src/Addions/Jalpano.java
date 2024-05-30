package Addions;

import Base.BasePizza;

public class Jalpano extends ToppinsDecorator{
	BasePizza base;
	
	public Jalpano(BasePizza base) {
		this.base=base;
	}
    @Override
	public int cost() {
		return base.cost()+35;
	}
	
}
