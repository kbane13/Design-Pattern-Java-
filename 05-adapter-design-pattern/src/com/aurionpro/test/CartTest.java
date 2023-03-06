package com.aurionpro.test;

import com.aurionpro.model.Biscuit;
import com.aurionpro.model.Hat;
import com.aurionpro.model.HatAdapter;
import com.aurionpro.model.ShoppingCart;

public class CartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addItemsToCart(new Biscuit("Parle-G", 60));
		System.out.println(cart.getCartPrice());

		Hat hat = new Hat("hat", "red hat", 10, 20);
		cart.addItemsToCart(new HatAdapter(hat));
		System.out.println(cart.getCartPrice());
	}

}
