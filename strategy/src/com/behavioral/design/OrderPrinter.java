package com.behavioral.design;

import java.util.Collection;

//Strategy
public interface OrderPrinter {
	
	void print(Collection<Order> orders);
}
