package com.ittx.car.serverimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ittx.car.dao.CarDao;
import com.ittx.car.model.Car;
import com.ittx.car.server.CarServer;

@Service("carServer")

@Transactional
public class CarServerimpl implements CarServer {
	@Autowired
	private CarDao carDao;

	public void addCar(Car car) {
		carDao.addCar(car);

	}

	public List<Car> getAllStudent() {
		List<Car> list = carDao.getAllStudent();
		return list;
	}

	public void updateCar(Car car, int id) {
		carDao.updateCar(car, id);

	}

	public void deleteCar(int id) {
		carDao.deleteCar(id);

	}

	public Car isExistCarByID(int id) {

		return carDao.isExistCarByID(id);
	}

	public Car isExistCarNumber(String number) {

		return carDao.isExistCarNumber(number);
	}

	public Car isExistCarModel(String model) {

		return carDao.isExistCarModel(model);
	}

	public Car isExistCarCarnumber(String carnumber) {
		// TODO Auto-generated method stub
		return carDao.isExistCarCarnumber(carnumber);
	}

	public void updateCars(Car car) {
		carDao.updateCars(car);

	}

}
