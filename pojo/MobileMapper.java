package com.Mobile.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MobileMapper implements RowMapper<Mobile> {
	
	public Mobile mapRow(ResultSet resultset,int i)throws SQLException {
		Mobile m =new Mobile();
		m.setId(resultset.getLong("id"));
		m.setName(resultset.getString("name"));
		m.setPrice(resultset.getLong("price"));
		m.setQuantity(resultset.getLong("quantity"));
		m.setDescription(resultset.getString("description"));
		return m;
	}

}
