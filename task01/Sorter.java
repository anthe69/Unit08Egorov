package com.epam.unit08.task01;

import java.util.Comparator;

public class Sorter implements Comparator<Customer> {
	@Override
	public int compare(Customer c1, Customer c2) {
		return c1.getLastName().compareToIgnoreCase(c2.getLastName());
	}
}
