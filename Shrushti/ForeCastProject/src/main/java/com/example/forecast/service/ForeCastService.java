package com.example.forecast.service;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.forecast.dao.ForecastRepo;
import com.example.forecast.entity.ForeCast;
@Service
public class ForeCastService implements CrudService<ForeCast, Integer>{
	@Autowired
	private ForecastRepo forecastrepo;
	
	@Override
	public ForeCast create(ForeCast forecast) {
		ForeCast createforecast = forecastrepo.save(forecast);
		return createforecast;
		
	}

	@Override
	public List<ForeCast> fetchAll() {
		
		return forecastrepo.findAll();
	}

	@Override
	public ForeCast fetchById(Integer id ) {
		 //return forecastrepo.findById(id).orElseThrow();
				 //(id).orElseThrow();
//		 new ForeCastNotFoundException("Invalid"));
		return fetchById(id);
				//orElseThrow(()-> new ForeCastNotFoundException("Invalid id"));
		
	}
	

	@Override
	public ForeCast update(ForeCast existing, ForeCast updated) {
		existing.setLocation(updated.getLocation());
		existing.setWeatherCondition(updated.getWeatherCondition());
		return forecastrepo.save(existing);
		
	}

	@Override
	public String delete(ForeCast forecast) {
		
		forecastrepo.delete(forecast);
		return forecast.getForecastId() +" deleted.";
	
	}

	@Override
	public ForeCast fetchForeCast(LocalDate date) {
		return forecastrepo.findByDate(date);
		
	}

	

}
