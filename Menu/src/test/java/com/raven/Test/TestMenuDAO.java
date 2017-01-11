package com.raven.Test;

import com.raven.Menu.Menu;
import com.raven.MenuDAO.MenuDAO;

public class TestMenuDAO {
	public static void main(String[] args) {

		MenuDAO menuDAO = new MenuDAO();

		Menu menu = new Menu();

		 menu.setId(1);
		 menu.setFood_name("Vada");

		 menuDAO.save(menu);
		// menuDAO.update(menu);
		//menuDAO.delete(1);

	}
}
