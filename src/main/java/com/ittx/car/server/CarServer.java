package com.ittx.car.server;



import java.util.List;

import com.ittx.car.model.Car;

public interface CarServer {
   void addCar(Car car);
   List<Car> getAllStudent();
   void updateCar(Car car,int id);
   void updateCars(Car car);
   void deleteCar(int id);
   Car isExistCarByID(int id);
   Car isExistCarNumber(String number);
   Car isExistCarModel(String model);
   Car isExistCarCarnumber(String carnumber);
}
