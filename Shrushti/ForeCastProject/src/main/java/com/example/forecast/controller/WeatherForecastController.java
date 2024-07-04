package com.example.forecast.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.forecast.dto.ErrorResponse;
import com.example.forecast.entity.ForeCast;
import com.example.forecast.service.ForeCastService;

@RestController
@RequestMapping("/forecast")
public class WeatherForecastController  {

	@Autowired
	private ForeCastService forecastservice;
	
	@PostMapping("/add")
	public ResponseEntity<?> registerforecast(@RequestBody ForeCast forecast) {
		ForeCast createforecast = forecastservice.create(forecast);
		return new ResponseEntity<>(createforecast, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllForecast(){
		try {
			return new ResponseEntity<>(forecastservice.fetchAll(), HttpStatus.OK);
		} catch (Exception e) {
			ErrorResponse errRes = new ErrorResponse(" fetching failed",e.getMessage());
			return new ResponseEntity<>(errRes, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getforecast/{forecastId}")
	public ResponseEntity<?> getUserById(@PathVariable("forecastId") int id){
		try {
			return ResponseEntity.ok(forecastservice.fetchById(id));
		} catch (Exception e) {
			return new ResponseEntity<>(new ErrorResponse("Not Found", e.getMessage()),HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateForeCastById(@PathVariable int id, @RequestBody ForeCast updated){
		try {
			ForeCast existing = forecastservice.fetchById(id);
			return ResponseEntity.ok(forecastservice.update(updated, existing));
		} catch (Exception e) {
			return new ResponseEntity<>(new ErrorResponse("ForeCast updation failed.", e.getMessage()),HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteUserById(@PathVariable Integer id){
		try {
			ForeCast existing = forecastservice.fetchById(id);
			return ResponseEntity.ok(forecastservice.delete(existing));
		} catch (Exception e) {
			return new ResponseEntity<>(new ErrorResponse("deletion failed.", e.getMessage()),HttpStatus.BAD_REQUEST);
		}
	}
	

	
}
