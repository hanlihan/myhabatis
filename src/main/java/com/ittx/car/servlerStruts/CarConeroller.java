package com.ittx.car.servlerStruts;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ittx.car.model.Car;
import com.ittx.car.server.CarServer;

@Controller
@RequestMapping("/cars")
public class CarConeroller {
	@Autowired
	private CarServer carserver;

	@RequestMapping("/add")
	public String addCar(Car car, Model model) {

		carserver.addCar(car);
		return "redirect:/cars/Show_Car.do";
	}

	@RequestMapping("/Show_Car")
	public String ShowCar(Map<String, Object> map) {

		List<Car> list = carserver.getAllStudent();
		map.put("list", list);
		map.put("kye",null);
		return "car/Show_Car";
	}

	@RequestMapping("/Find_Car")
	public String FindCar(String type, String keyword, Map<String, Object> map) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>FINs");
		System.out.println(type+"TYOE");
		System.out.println(keyword+"KEY");
		if (type.equals("carnumber")) {
			Car cars = carserver.isExistCarCarnumber(keyword);
			map.put("list", cars);
		}
		if (type.equals("model")) {
			Car cars =  carserver.isExistCarModel(keyword);
			map.put("list", cars);
		}
		if (type.equals("number")) {
			Car cars =carserver.isExistCarNumber(keyword);
			map.put("list", cars);
		}
		map.put("key","yes");
		return "car/Show_Car";

	}

	@RequestMapping("/findId_Car")
	public String FindByInCar(@RequestParam("id") Integer id, Map<String, Object> map) {
		Car car = carserver.isExistCarByID(id);
		map.put("car", car);
		return "car/Find_Car";

	}

	@RequestMapping("/deleta_Car")
	public String DeletaByInCar(@RequestParam("id") Integer id, Map<String, Object> map) {
		carserver.deleteCar(id);
		return "redirect:/cars/Show_Car.do";

	}

	@RequestMapping("/update_Car")
	public String UpdateByInCar(@RequestParam("id") Integer id, Map<String, Object> map) {
		System.out.println("id" + id);
		Car car = carserver.isExistCarByID(id);
		System.out.println("car" + car);
		map.put("cars", car);

		return "car/update";

	}

	@RequestMapping("/updateCar")
	public String UpdateCar(Car car, Map<String, Object> map) {

		System.out.println(car);
		carserver.updateCars(car);

		return "redirect:/cars/Show_Car.do";

	}

}
