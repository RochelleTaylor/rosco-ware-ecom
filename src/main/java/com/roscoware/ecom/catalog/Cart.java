package com.roscoware.ecom.catalog;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Adding an innerClass between Cart & Product called CartItem which will be mapped to Product instead of Cart

public class Cart {

	@Id
	@GeneratedValue
	private Long id;
	private String customerName;

	public String getCustomerName() {
		return customerName;
	}

	public static double getDefaultCartbalance() {
		return DEFAULT_CARTBALANCE;
	}

	static final double DEFAULT_CARTBALANCE = 0.00;
	protected double cartBalance = DEFAULT_CARTBALANCE;

	public Cart(double cartTotal, String customerName) {
		this.cartBalance = cartTotal;
		this.customerName = customerName;
	}

	public Long getId() {
		return id;
	}

	public double getCartTotal() {
		return cartBalance;
	}

	// @SuppressWarnings("unused")
	// private Cart() {
	// }

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		return id == ((Cart) obj).id;
	}

	@Override
	public int hashCode() {
		return ((Long) id).hashCode();
	}

}
