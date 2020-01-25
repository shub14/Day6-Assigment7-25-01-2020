package com.Mobile.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Mobile.config.Mobileconfig;
import com.Mobile.dao.Mobiledao;
import com.Mobile.pojo.Mobile;

public class MobileMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Mobileconfig.class);

		Mobiledao mdao = context.getBean(Mobiledao.class);

		System.out.println("List of mobiles is:");

		for (Mobile m : mdao.getAllMobiles()) {
			System.out.println(m);
		}

		

		System.out.println("\nCreating Mobile: ");
		Mobile m = new Mobile(7L,"Oppo",20000L, 22L,"Cool");
		System.out.println(m);
		mdao.createMobile(m);
		System.out.println("\nList of mobile is:");

		for (Mobile md : mdao.getAllMobiles()) {
			System.out.println(md);
		}
		System.out.println("\nUpdate person with ID 5");

		Mobile mi = mdao.getMobilebyId(5L);
		mi.setName("name");
		mdao.updateMobile(mi);
		System.out.println("\nGet mobile with ID 7");

		Mobile mId = mdao.getMobilebyId(7L);
		System.out.println(mId);

		System.out.println("\nDeleting person with ID 7");
		mdao.deleteMobile(mId);

		

		System.out.println("\nList of person is:");
		for (Mobile mn : mdao.getAllMobiles()) {
			System.out.println(mn);
		}

		context.close();
	}


	}


