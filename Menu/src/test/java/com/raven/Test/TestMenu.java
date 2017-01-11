package com.raven.Test;

import com.raven.Menu.Menu;

public class TestMenu {
	public static void main(String[] args) {

		Menu menu = new Menu();

		System.out.println(menu.getId());
		System.out.println(menu.getFood_name());

		menu.setId(1);
		menu.setFood_name("Idli");

		System.out.println(menu.toString());

		System.out.println(menu.getId());
		System.out.println(menu.getFood_name());
	}
}