package com.kevinhuang.pbm.util;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;
import org.hibernate.service.ServiceRegistry;

import com.kevinhuang.pbm.entity.Account;

public class HibernateUtil {
	private static SessionFactory factory;
	static{
		Configuration cfg = new Configuration().configure();
		
		cfg.addClass(Account.class);
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
 //       SessionFactory sessionFactory=cfg.buildSessionFactory(serviceRegistry);
		factory=cfg.buildSessionFactory(serviceRegistry);

	}
	
	public static Session getSession() throws Exception{
		return factory.openSession();
	}

}
