package com.Mobile.dao;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.Mobile.pojo.Mobile;
import com.Mobile.pojo.MobileMapper;

@Component
public class MobiledaoImpl implements Mobiledao {
	JdbcTemplate jdbcTemplate;
	
	private final String Find_Mobile = "select * from Mobile where id = ?";
	private final String Delete_Mobile = "delete from Mobile where id = ?";
	private final String Update_Mobile = "update Mobile set name = ?, price = ?,quantity =?,description=? where id = ?";
	private final String Show_All_Mobiles = "select * from Mobile";
	private final String Add_Mobile = "insert into Mobile(id,name,price,quantity,description) values(?,?,?,?,?)";

	@Autowired
	public MobiledaoImpl (DataSource datasource) {
		jdbcTemplate= new JdbcTemplate(datasource);
	} 

     public Mobile getMobilebyId(Long id) {
		
		return jdbcTemplate.queryForObject(Find_Mobile, new Object[] { id }, new MobileMapper());
	}


	public List<Mobile> getAllMobiles() {
		return jdbcTemplate.query(Show_All_Mobiles, new MobileMapper());
	}

	public boolean deleteMobile(Mobile m) {
		return jdbcTemplate.update(Delete_Mobile, m.getId()) > 0;
	}

	public boolean updateMobile(Mobile m) {
		return jdbcTemplate.update(Update_Mobile, m.getName(), m.getPrice(), m.getQuantity(),m.getDescription(),
				m.getId()) > 0;
	}

	public boolean createMobile(Mobile m) {
		return jdbcTemplate.update(Add_Mobile, m.getId(), m.getName(), m.getPrice(),m.getQuantity(),m.getDescription()
				) > 0;
	}

	
}
