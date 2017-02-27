package com.ittx.car.daoimp;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ittx.car.dao.CarDao;
import com.ittx.car.model.Car;

@Repository("carDao")
public class CarDaoimpl extends MyHibernateDaoSupport implements CarDao {

	public void addCar(Car car) {
		
		getHibernateTemplate().save(car);
		System.out.println(car+">>>>>>>>>>>>>>>>>>.");
		
	}

	
	public List<Car> getAllStudent() {
		// return (List<Car>) getHibernateTemplate().find("FROM Car");

		List<Car> lists = getHibernateTemplate().execute(new HibernateCallback<List<Car>>() {

			
			public List<Car> doInHibernate(Session s) throws HibernateException {
				SQLQuery q = s.createSQLQuery("select * from car").addEntity(Car.class);
				// Query q = s.createQuery("From Car");
				List<Car> cars = q.list();
				return cars;
			}
		});
		return lists;

	}


	public void updateCar(Car car, int id) {
		
		Car cars = car;
		cars.setUid(id);
		getHibernateTemplate().update(cars);
		
	}


	public void deleteCar(int id) {
		System.out.println(id + ">>>>>>>>>>>>>>>>>>>>>>>.");
		Car car = isExistCarByID(id);
		getHibernateTemplate().delete(car);
	}


	public Car isExistCarByID(int id) {
		
	
		Car car=getHibernateTemplate().get(Car.class, id);
		System.out.println(car);
				return car;

	}

	
	public Car isExistCarNumber(String number) {
		for (Car car : getAllStudent()) {
			if(car.getNumber().equals(number)){
				return car;
			}
		}
		return null;
	}


	public Car isExistCarModel(String model) {
		for (Car car : getAllStudent()) {
			if(car.getModel().equals(model)){
				return car;
			}
		}
		return null;
	}

	
	public Car isExistCarCarnumber(String carnumber) {
		for (Car car : getAllStudent()) {
			if(car.getCarnumber().equals(carnumber)){
				return car;
			}
		}
		return null;
	}

	
	public void updateCars(Car car) {

		getHibernateTemplate().update(car);
		
	}

	

	

}
