package com.Mobile.dao;

import java.util.List;
import com.Mobile.pojo.Mobile;
public interface Mobiledao {

	 Mobile getMobilebyId(Long id);
	 List<Mobile> getAllMobiles();
	 boolean deleteMobile(Mobile m);
	 boolean updateMobile(Mobile m);
	 boolean createMobile(Mobile m);
}
