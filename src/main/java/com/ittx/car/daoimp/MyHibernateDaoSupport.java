package com.ittx.car.daoimp;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class MyHibernateDaoSupport extends HibernateDaoSupport {
	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}
	
}
