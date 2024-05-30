package Addions;

import Base.BasePizza;

public class papreka extends ToppinsDecorator{

	BasePizza base;
	
	public papreka(BasePizza base) {
		this.base=base;
	}

	@Override
	public int cost() {
		return base.cost()+30;
	}
}
