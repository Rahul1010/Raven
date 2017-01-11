package com.raven.MenuDAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.Menu.Menu;
import com.raven.ConnectionUtil.ConnectionUtil;

public class MenuDAO {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void save(Menu menu) {

		String sql = "insert into menu(id,Food_name) values(?,?)";
		Object[] params = { menu.getId(), menu.getFood_name() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}

	public void update(Menu menu) {

		String sql = "update menu set name=? where id=?";
		Object[] params = { menu.getFood_name(), menu.getId() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows updated: " + rows);

	}

	public void delete(int id) {

		String sql = "delete from menu where id=?";
		Object[] params = { id };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows deleted: " + rows);

	}

}