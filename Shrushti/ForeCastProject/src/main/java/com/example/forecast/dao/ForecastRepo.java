package com.example.forecast.dao;


import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.forecast.entity.ForeCast;


public interface ForecastRepo extends JpaRepository<ForeCast, Long> {
	
   ForeCast findByDate(LocalDate date);

}
