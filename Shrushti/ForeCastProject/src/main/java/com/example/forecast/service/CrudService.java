package com.example.forecast.service;


import java.time.LocalDate;
import java.util.List;

import com.example.forecast.entity.ForeCast;

public interface CrudService<T,K>{

	// add User
		 T create(T t);
		 
		 // get all userList
		List<T> fetchAll();
		 
		 // get user
		 T fetchById(K k);
		 
		 // update user
		 T update(T t1, T t2);
		 
		 // delete user
		 String delete(T t);

		ForeCast fetchForeCast(LocalDate date);
}
